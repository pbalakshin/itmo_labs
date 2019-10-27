import time
import xmlplain_test
import xmltodict_test
import inf_lab4
import os


def test_lib(lib, inf, outf, text):
    start = time.time()
    for _ in range(10):
        lib.test(inf, outf)
        inf.seek(0)
    stop = time.time()
    print('%s: ' % text, stop - start)


with open(os.devnull, "w") as null, \
     open('schedule.xml', encoding='utf-8') as inf:
    test_lib(xmlplain_test, inf, null,
             'xmlplain')
    test_lib(xmltodict_test, inf, null,
             'xmltodict')
    test_lib(inf_lab4, inf, null,
             'my own lib')


