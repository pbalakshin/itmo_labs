def qsort(digits, key=lambda x: x, reverse=False):
    # quick sort with key
    if len(digits) <= 1:
        return digits
    else:
        supp = digits[len(digits) // 2]
        supp_value = key(supp)
    less = [n for n in digits if key(n) < supp_value]
    supps = [n for n in digits if key(n) == supp_value]
    more = [n for n in digits if key(n) > supp_value]
    if reversed:
        return qsort(more, key, reverse) + \
               supps + qsort(less, key, reverse)
    return qsort(less, key) + supps + \
           qsort(more, key)


def print_person(printed_person):
    for j, point in enumerate(printed_person):
        print(point, end=' ')
        if j != len(printed_person) - 1 and \
           j != 0:
            print('|', end=' ')


# file columns
SURNAME = 0
INITIALS = 1
DOB = 2  # day of burn
DOI = 3  # date of issue of passport
MARK_1 = 4
MARK_2 = 5
MARK_3 = 6

with open('input_file.txt') as file:
    file_lines = file.read().splitlines()

db = []
for line in file_lines:
    split_line = line.split()
    for i in MARK_1, MARK_2, MARK_3:
        split_line[i] = int(split_line[i])
    db.append(tuple(split_line))

avg_marks = []  # average marks
for i, person in enumerate(db):
    marks_sum = sum(person[MARK_1:MARK_3 + 1])
    avg = marks_sum / 3
    avg_int = int(avg)
    if avg == avg_int:
        avg = avg_int
    else:
        avg = round(avg, 6)
    avg_marks.append([avg, i])

sorted_avg_marks = qsort(avg_marks, lambda x: x[0], True)

for mark in sorted_avg_marks:
    person = db[mark[1]]
    print_person(person)
    print('->', str(mark[0]).replace('.', ','))
