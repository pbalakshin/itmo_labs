import xml_parser

root = xml_parser.parse('schedule.xml')
with open('schedule.yaml', 'w') as f:
    xml_parser.to_yaml(root, f)