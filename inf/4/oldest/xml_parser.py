from oldest import xml_element, xml_lexer, xml_regexes, xml_prolog_handle


class XmlParserError(Exception):
    pass


def read_xml(file_name: str):
    with open(file_name) as f:
        strings = f.read().replace('\n', '').lstrip().rstrip()
    return strings


class XmlParser:
    def __init__(self, file):
        self.__file = file

    @staticmethod
    def parse_attributes(tag: str):
        words = tag.split()
        attrs = {}
        if words[0] == '<':
            start = 2
        else:
            start = 1
        for i in range(start, len(words)-1):
            if not xml_regexes.attribute.match(words[i]):
                raise XmlParserError(
                    'Wrong attribute {}'.format(words[i]))
            name, value = words[i].split('=')
            if name not in attrs:
                attrs[name] = value[1:-1]
        last_word = words[-1]
        if last_word[-1] == ">":
            last_word = words[-1][:-1]
        if len(words) > 1 and last_word:
            if not xml_regexes.attribute.match(last_word):
                raise XmlParserError(
                    'Wrong attribute {}'.format(last_word))
            name, value = last_word.split('=')
            attrs[name] = value[1:-2]
        return attrs

    def __recur_parse(self, tokens, el: xml_element.XmlElement, p=0, tag_stack=None):
        if tag_stack is None:
            tag_stack = []
        tag_match = xml_regexes.tag.match(tokens[p])
        if tag_match:
            opened = tag_match.group(1) != '/'
            if opened:
                self_closed = tag_match.group(5) == '/'
                if not self_closed:
                    tag_stack.append(tag_match.group(2))
                p += 1
                self.__recur_parse(tokens,
                                   el,
                                   p=p,
                                   tag_stack=tag_stack)
            else:
                if tag_stack.pop() == tag_match.group(2):
                    el.add_value()

    def parse(self):
        tokens = xml_lexer.XmlLexer(self.__file).get_tokens()
        for a in tokens:
            print('"{}"'.format(a))
        if len(tokens) == 0:
            return
        prolog_match = xml_regexes.prolog.match(tokens[0])
        prolog_attrs = xml_prolog_handle.get_attributes_from_prolog(
            prolog_match)
        if prolog_attrs['version'] != '1.0' or \
            prolog_attrs['standalone'] != 'yes':
            raise XmlParserError(
                'Parse only standalone 1.0 xml')

        start = 0
        if prolog_match:
            start = 1
        root_tag_match = xml_regexes.tag.match(
            tokens[start])
        root_tag_name = root_tag_match.group(1)
        root_attributes = self.parse_attributes(tokens[start])
        root_self_closed = root_tag_match.group(4) == '/'
        xml_element.XmlElement(root_tag_name, True,
                               prolog_attrs, root_attributes,
                               root_self_closed)
        print(root_tag_name, True,
                               prolog_attrs, root_attributes,
                               root_self_closed)



XmlParser('schedule.xml').parse()