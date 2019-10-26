import re
from oldest import xml_constants


def get_attributes_from_prolog(prolog_search: re.Match):
    if prolog_search:
        xml_version = prolog_search.group(1)
        xml_encoding = prolog_search.group(2) or \
                       xml_constants.default_xml_encoding
        xml_standalone = prolog_search.group(3) or \
                         xml_constants.default_xml_standalone
        prolog_attributes = {
            'version': xml_version,
            'encoding': xml_encoding,
            'standalone': xml_standalone
        }
        return prolog_attributes
    else:
        return


def get_default_prolog_attributes():
    prolog_attributes = {
        'version': xml_constants.default_xml_version,
        'encoding': xml_constants.default_xml_encoding,
        'standalone': xml_constants.default_xml_standalone
    }
    return prolog_attributes
