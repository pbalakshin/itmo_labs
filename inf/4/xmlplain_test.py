import xmlplain


def test(inf, outf):
    with open('schedule.xml') as inf, \
         open("schedule_xmlplain.yaml", "w") as outf:
        root = xmlplain.xml_to_obj(inf, strip_space=True, fold_dict=True)
        xmlplain.obj_to_yaml(root, outf)


if __name__ == "__main__":
    with open('schedule.xml') as inf, \
         open("schedule_xmlplain.yaml", "w") as outf:
        test(inf, outf)
