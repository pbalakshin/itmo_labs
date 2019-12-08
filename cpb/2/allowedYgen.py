with open('allowedY.csv', 'w+') as f:
    f.write('X_i, allowed Y_i\n')
    for x in range(-2**15, 0):
        f.write('{}, "[{}; {}]"\n'.format(x, -2**15 - x, 2**15 - 1))
    for x in range(0, 2**15):
        f.write('{}, "[{}; {}]"\n'.format(x, -2**15, 2**15 - 1 - x))
