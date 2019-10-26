from oldest.xml_read import read_xml
import re


class XmlLexerError(Exception):
    pass


class XmlLexer:
    def __init__(self, file: str):
        self.__file = file

    def get_tokens(self):
        s = read_xml(self.__file)
        tokens = []
        tmp_p = 0
        is_in_tag = False
        for p in range(len(s)):
            if s[p] == '<':
                if tmp_p is not None \
                        and not re.match('^\s*$', s[tmp_p:p]):
                    tokens.append(s[tmp_p:p])
                is_in_tag = True
                tmp_p = p
            elif s[p] == '>':
                tokens.append(s[tmp_p:p+1])
                is_in_tag = False
                tmp_p = None
            elif tmp_p is None and not is_in_tag:
                if not re.match('\s', s[p]):
                    tmp_p = p
            elif not is_in_tag:
                pass
        return tokens

