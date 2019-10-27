import xmltodict
import yaml


def test(inf, outf):
    xml = inf.read()

    d = xmltodict.parse(xml, process_namespaces=True,
                        dict_constructor=dict)

    yaml.safe_dump(d, outf, default_flow_style=False,
                   encoding='utf-8', allow_unicode=True)


if __name__ == "__main__":
    with open('schedule.xml', encoding='utf-8') as inf, \
         open("schedule_xmltodict.yaml", "w", encoding='utf-8') as outf:
        test(inf, outf)
