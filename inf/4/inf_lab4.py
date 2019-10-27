import xml_parser


def test(inf, outf):
    root = xml_parser.parse(inf)
    xml_parser.to_yaml(root, outf)


if __name__ == "__main__":
    with open('schedule.xml', encoding='utf-8') as inf, \
         open("schedule.yaml", "w", encoding='utf-8') as outf:
        test(inf, outf)
