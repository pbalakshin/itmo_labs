from enum import Enum
from typing import NamedTuple
from typing import Optional
from typing import List
from typing import Union
import re


class XmlLexerError(Exception):
    pass


tag_re = re.compile(
    r"""^(?!<[xX][mM][lL])
    (<\s*([a-zA-Z_][-a-zA-Z_.\d]*)
    ((\s*[a-zA-Z_][-a-zA-Z_.\d]*=(['\"]).*\5)*)
    \s*(\/)?>|</\s*([a-zA-Z_][-a-zA-Z_.\d]*)\s*>)""",
    re.X)

open_tag_re = re.compile(
    r"""^(?!<[xX][mM][lL])
    <\s*([a-zA-Z_][-a-zA-Z_.\d]*)
    ((\s*[a-zA-Z_][-a-zA-Z_.\d]*=(['\"]).*\4)*)\s*>""",
    re.X)

close_tag_re = re.compile(
    r"""^(?!<[xX][mM][lL])</([a-zA-Z_][-a-zA-Z_.\d]*)\s*>""",
    re.X)

self_closed_tag_re = re.compile(r"""^(?!<[xX][mM][lL])
<\s*([a-zA-Z_][-a-zA-Z_.\d]*)
((\s*[a-zA-Z_][-a-zA-Z_.\d]*=(['\"]).*\4)*)\s*\/>""",
                                re.X)

data_re = re.compile(r'[^<>]+')

attribute_re = re.compile(
    r"""[a-zA-Z_][-a-zA-Z_.\d]*=(["']).*\1""")


decl_re = re.compile(
    r"""<\?xml\s+
    version=['"](\d\.\d)['"]
    (?:\s+encoding=['"]([-a-zA-Z\d]+)['"])?
    (?:\s+standalone=['"](yes|no)['"])?
    \s*\?>""", re.X)


class XmlLexemeTypes(Enum):
    tag, data, decl = range(3)


class XmlTagTypes(Enum):
    open, close, self_closed = range(3)


class TagParameters(NamedTuple):
    name: str
    type: XmlTagTypes
    attributes: dict


class DeclAttributes(NamedTuple):
    version: str
    encoding: str
    standalone: str


class XmlLexeme:
    type: XmlLexemeTypes
    lexeme: Optional[str]
    attributes: Union[Optional[TagParameters], DeclAttributes]

    def __init__(self, _type: XmlLexemeTypes, lexeme: str,
                 attrs: Union[Optional[TagParameters], DeclAttributes]):
        self.type = _type
        self.lexeme = lexeme
        self.attributes: \
            Union[Optional[TagParameters], DeclAttributes] = attrs
        # cos data attrs is null


def recognize_xml_lexeme(lexeme: str) -> Optional[XmlLexemeTypes]:
    tag_match = tag_re.match(lexeme)
    data_match = data_re.match(lexeme)
    if tag_match and not data_match:
        return XmlLexemeTypes.tag
    elif data_match and not tag_match:
        return XmlLexemeTypes.data


def recognize_tag_attributes(tag_match: re.Match) -> dict:
    attributes = {}
    atrrs_string = tag_match.group(3)
    if atrrs_string is not None:
        for s in atrrs_string.split():
            if not attribute_re.match(s):
                raise XmlLexerError(
                    'Wrong attribute {} in tag {}'.format(
                        s, tag_match.group(2)))
            name, value = s.split('=')
            value = value[1:-1]
            if name not in attributes:
                attributes[name] = value
            else:
                raise XmlLexerError('>=2 attrs with same name in {} tag'.format(
                    tag_match.group(2)))
    return attributes


def recognize_tag_parameters(tag: str) -> TagParameters:
    string = tag
    tag_match = tag_re.match(tag)
    if not tag_match:
        raise XmlLexerError('Wrong tag: {}'.format(tag))
    name = ''
    close_match = close_tag_re.match(tag)
    is_close = bool(close_match)
    self_closed_match = self_closed_tag_re.match(tag)
    is_self_closed = bool(self_closed_match)
    open_match = open_tag_re.match(tag)
    is_open = bool(open_match)
    _type: XmlTagTypes
    if is_open and not is_close and not is_self_closed:
        _type = XmlTagTypes.open
        name = open_match.group(1)
    elif is_close and not is_open and not is_self_closed:
        _type = XmlTagTypes.close
        name = close_match.group(1)
    elif is_self_closed and not is_open and not is_close:
        _type = XmlTagTypes.self_closed
        name = self_closed_match.group(1)
    else:
        raise XmlLexerError(
            'Unrecognized tag: {}'.format(string))
    attributes = recognize_tag_attributes(tag_match)
    return TagParameters(name=name, type=_type,
                         attributes=attributes)


def read_xml(file: str) -> str:
    with open(file) as f:
        xml = f.read().replace('\n', '').lstrip().rstrip()
    return xml


def get_tokens(file: str) -> List[XmlLexeme]:
    tokens: List[XmlLexeme] = []
    s = read_xml(file)
    tmp_p = 0
    start = 0
    decl_attrs: DeclAttributes
    decl_match = decl_re.match(s)
    if decl_match:
        decl_span = decl_match.span()
        if decl_span[0] != 0:
            raise XmlLexerError('Xml declaration not at the beginning of file')
        start = decl_span[1]
        tmp_p = start
        decl_attrs = DeclAttributes(decl_match.group(1) or '1.0',
                                    decl_match.group(2) or 'utf-8',
                                    decl_match.group(3) or 'yes')
    else:
        decl_attrs = DeclAttributes('1.0',
                                    'utf-8',
                                    'yes')
    decl_string = decl_match.group(0) if decl_match is not None else None
    tokens.append(XmlLexeme(XmlLexemeTypes.decl,
                            decl_string, decl_attrs))
    for p in range(start, len(s)):
        c = s[p]
        if c == '<':
            data = s[tmp_p:p].lstrip()
            if data:
                tokens.append(XmlLexeme(XmlLexemeTypes.data,
                                    data, None))
            tmp_p = p
        if c == '>':
            tag = s[tmp_p:p+1]
            params = recognize_tag_parameters(tag)
            tokens.append(XmlLexeme(XmlLexemeTypes.tag, tag, params))
            tmp_p = p+1
    return tokens


#print(recognize_tag_parameters("""<tesdafa n="d" n2="d" n3='d'/>"""))
#t = get_tokens('schedule.xml')
#for a in t:
#    print(a.lexeme, a.attributes)