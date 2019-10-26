def read_xml(file_name: str):
    with open(file_name) as f:
        strings = f.read().replace('\n', '').lstrip().rstrip()
    return strings
