import math

values = {}
N = 0
while True:
    inpt = input()
    if inpt == 'stop':
        break
    N += 1
    inpt = float(inpt)
    try:
        values[inpt] += 1
    except KeyError:
        values[inpt] = 1

probs = {}
for v in values:
    probs[v] = values[v] / N

exp_v = 0
for p in probs:
    exp_v += p * probs[p]
print('expected value: ' + str(exp_v))

sq_s = 0
str_dev = 0

for v in values:
    sq_s += (v - exp_v)**2
sq_s = math.sqrt( (1/(N-1)) * sq_s)
print('standard deviation: ' + str(sq_s))
