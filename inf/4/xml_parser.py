import handling
import regexses


class XmlElement():
    def __init__(self):
        self.__name = ''
        self.__attributes = {}
        self.__open_tag = ''
        self.__close_tag = ''
        self.__type = None  # TODO: think about types
        self.__value = None  # TODO: think about values and about life

    def set_name(self):
        pass

    def set_attribute(self):
        pass

    def set_open_tag(self):
        pass

    def set_close_tag(self):
        pass

    def set_type(self):
        pass

    def set_value(self):
        pass


class XmlParserError(Exception):
    pass


def read_xml(file_name: str):
    with open(file_name) as f:
        strings = f.read().replace('\n', '').lstrip().rstrip()
    return strings


def parse_xml(xml_string: str):
    prolog_search = regexses.prolog.search(xml_string)
    pointer = 0
    if prolog_search and not prolog_search.start():
        prolog = prolog_search.group(0)
        prolog_attributes = \
            handling.get_attributes_from_prolog(prolog_search)
        if prolog_attributes['version'] != '1.0' or \
                prolog_attributes['standalone'] != 'yes':
            raise XmlParserError('Parse only standalone xml 1.0')
    else:
        prolog_attributes = handling.get_default_prolog_attributes()
        prolog = ''
    pointer = len(prolog) + (1 if prolog else 0)
    print(pointer)


parse_xml("<?xml version=\"1.0\"?><e></e>")
