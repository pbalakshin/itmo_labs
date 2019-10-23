import re

default_xml_version = '1.0'
default_xml_encoding = 'utf-8'
default_xml_standalone = 'yes'


def get_attributes_from_prolog(prolog_search: re.Match):
    if prolog_search:
        xml_version = prolog_search.group(1)
        xml_encoding = prolog_search.group(2) or default_xml_encoding
        xml_standalone = prolog_search.group(3) or default_xml_standalone
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
        'version': default_xml_version,
        'encoding': default_xml_encoding,
        'standalone': default_xml_standalone
    }
    return prolog_attributes
