import re

tag_name = re.compile(
    r'^(?![xX][mM][lL])[a-zA-Z_][-a-zA-Z_.]*')
tag = re.compile(
    r"""^(?!<[xX][mM][lL])
    <(\/)?\s*([a-zA-Z_][-a-zA-Z_.\d]*)
    (\s*[a-zA-Z_][-a-zA-Z_.\d]*=(['"]).*\4)
    *\s*(\/)?>""", re.X)
attribute_name = re.compile(
    r'[a-zA-Z_][-a-zA-Z_.\d]*')
attribute = re.compile(
    r"""[a-zA-Z_][-a-zA-Z_.\d]*=(["']).*\1""")
prolog = re.compile(
    r"""<\?xml\s+
    version=['"](\d\.\d)['"]
    (?:\s+encoding=['"]([-a-zA-Z\d]+)['"])?
    (?:\s+standalone=['"](yes|no)['"])?
    \s*\?>""", re.X)
