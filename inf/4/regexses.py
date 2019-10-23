import re

tag_name = re.compile(
    r'^(?![xX][mM][lL])[a-zA-Z_][-a-zA-Z_.]*')
attribute_name = re.compile(
    r'[a-zA-Z_][-a-zA-Z_.]*')
prolog = re.compile(
    r"""<\?xml\s+
    version=['"](\d\.\d)['"]
    (?:\s+encoding=['"]([-a-zA-Z\d]+)['"])?
    (?:\s+standalone=['"](yes|no)['"])?
    \s*\?>""", re.X)
