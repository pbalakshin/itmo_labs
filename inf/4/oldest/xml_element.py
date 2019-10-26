import enum
from oldest import xml_regexes


class XmlElementError(Exception):
    pass


class XmlElementAttr(enum.Enum):
    name, is_root_element, prolog_attributes, \
        attributes, is_self_closed_, value, \
        parent = range(7)


class XmlElement:
    def __init__(self, name: str, is_root_element: bool,
                 prolog_attributes: dict, attributes: dict,
                 is_self_closed: bool):
        self.check_name(name)
        self.__name = name
        self.__is_root_element = is_root_element
        self.__prolog_attributes = prolog_attributes
        for attr_name in attributes:
            self.check_attr_name(attr_name)
        self.__attributes = attributes
        self.__is_self_closed = is_self_closed
        self.__value = []
        self.__parent = None

    def get(self, attr: XmlElementAttr):
        if attr == XmlElementAttr.name:
            return self.__name
        elif attr == XmlElementAttr.is_root_element:
            return self.__is_root_element
        elif attr == XmlElementAttr.prolog_attributes:
            return self.__prolog_attributes
        elif attr == XmlElementAttr.attributes:
            return self.__attributes
        elif attr == XmlElementAttr.is_self_closed_:
            return self.__is_self_closed
        elif attr == XmlElementAttr.value:
            return self.__value
        elif attr == XmlElementAttr.parent:
            return self.__parent

    def add_value(self, value):
        self.__value.append(value)

    def set_parent(self, parent):
        self.__parent = parent

    @staticmethod
    def check_name(name: str):
        if not xml_regexes.tag_name.match(name):
            raise XmlElementError(
                'Invalid tag name: "{}"'.format(name))

    @staticmethod
    def check_attr_name(name: str):
        if not xml_regexes.attribute_name.match(name):
            raise XmlElementError(
                'Invalid attribute name: "{}"'.format(name))
