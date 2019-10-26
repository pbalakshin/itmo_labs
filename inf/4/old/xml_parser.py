from old.xml_lexer import XmlLexeme
from old.xml_lexer import XmlLexemeTypes
from old.xml_lexer import XmlTagTypes
from old import xml_lexer


class XmlParserError(Exception):
    pass


class XmlElement:
    lexeme: XmlLexeme
    inc: list

    def __init__(self, lexeme, parent):
        self.lexeme = lexeme
        self.parent = parent
        self.inc = []


def __recur_parse(p, tokens, el, tag_stack=None):
    if tag_stack is None:
        tag_stack = []

    if p == len(tokens) - 1:
        return

    if tokens[p].type == XmlLexemeTypes.tag:
        tag_type = tokens[p].attributes.type
        if tag_type == XmlTagTypes.open:
            el = XmlElement(tokens[p], el)
            tag_stack.append(tokens[p].attributes.name)
            p += 1
            __recur_parse(p, tokens, el, tag_stack)
        if tag_type == XmlTagTypes.close:
            el.parent.inc.append(el)
            el = el.parent
            if tag_stack.pop() != tokens[p].attributes.name:
                raise XmlParserError()
            p += 1
            __recur_parse(p, tokens, el, tag_stack)
    elif tokens[p].type == XmlLexemeTypes.data:
        el.inc.append(XmlElement(tokens[p], None))
        p += 1
        __recur_parse(p, tokens, el, tag_stack)


def parse(file):
    root: XmlElement
    tokens = xml_lexer.get_tokens(file)
    start = 0
    if tokens[0].type == XmlLexemeTypes.decl:
        decl = tokens[0]
        start = 1
        if decl.attributes.version != '1.0' \
           or decl.attributes.standalone != 'yes':
            print(decl.attributes.standalone)
            raise XmlParserError('Parse only standalone 1.0 xml')
    root = XmlElement(tokens[start], None)
    __recur_parse(start+1, tokens, root)
    return root


def to_yaml(el, d=0):
    if el.lexeme.type == XmlLexemeTypes.data:
        print(el.lexeme.lexeme)
    elif el.lexeme.type == XmlLexemeTypes.tag:
        print(d*'  ', el.lexeme.lexeme, ': ', sep='', end='')
        if len(el.inc) != 1:
            d += 1
            for i in el.inc:
                to_yaml(i, d)
        else:
            print(el.inc[0].lexeme.lexeme)




root = parse('schedule.xml')
to_yaml(root)