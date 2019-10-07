import math

t = (
    (0.15, 0.4, 1.3, 2.6),
    (0.15, 0.5, 1.2, 2.9),
    (0.15, 0.7, 1.3, 3.6),
    (0.15, 0.9, 1.3, 4.1),
    (0.15, 1.1, 1.2, 4.6)
)

Y = [0] * 5
Z = [0] * 5
for i in range(5):
    Y[i] = t[i][1] - t[i][0]
    Z[i] = (t[i][3]**2 - t[i][2]**2) / 2


tmp1 = tmp2 = 0
for i in range(5):
    tmp1 += Z[i] * Y[i]
    tmp2 += Z[i]**2
a = round(tmp1 / tmp2, 2)
tmp1 = 0
for i in range(5):
    tmp1 += (Y[i] - (a*Z[i]))**2
sigma = math.sqrt(tmp1 / tmp2)

h0 = 196
h10 = 194

t = (
    (187, 193,
     (1.2, 1.3, 1.2, 1.3, 1.4),
     (4.5, 4.6, 4.5, 4.6, 4.7)
     ),
    (178, 193,
     (0.9, 0.9, 0.8, 0.9, 0.9),
     (3.2, 3.2, 3.1, 3.2, 3.2)
     ),
    (169, 193,
     (0.7, 0.7, 0.7, 0.7, 0.7),
     (2.6, 2.6, 2.5, 2.5, 2.5)
     ),
    (160, 192,
     (0.7, 0.6, 0.7, 0.7, 0.7),
     (2.2, 2.1, 2.1, 2.2, 2.2)
     ),
    (151, 192,
     (0.7, 0.7, 0.7, 0.7, 0.7),
     (2.0, 2.0, 2.0, 2.0, 2.0)
     )
)

s = [0] * 5
for i in range(5):
    s[i] = round(((h0 - t[i][0])-(h10 - t[i][1])) / 780,3)

avg_t = [[0, 0] for _ in range(5)]
for i in range(5):
    avg_t[i][0] = round(sum(t[i][2]) / 5, 1)
    avg_t[i][1] = round(sum(t[i][3]) / 5, 1)
sigma_t = [[0, 0] for _ in range(5)]
for i in range(5):
    for j in range(2):
        tmp1 = 0
        for k in range(5):
            tmp1 += (t[i][2+j][k] - avg_t[i][j])**2
        sigma_t[i][j] = round(math.sqrt(tmp1/20), 2)
delta_avg_t = [[0, 0] for _ in range(5)]
for i in range(5):
    for j in range(2):
        delta_avg_t[i][j] = sigma_t[i][j] * 2.78
delta_t = [[0, 0] for _ in range(5)]
for i in range(5):
    for j in range(2):
        delta_t[i][j] = round(math.sqrt(delta_avg_t[i][j]**2 + ((2/3) * 0.1)**2), 3)
a = [0] * 5
for i in range(5):
    a[i] = round(1.9 /(avg_t[i][1]**2 - avg_t[i][0]**2), 3)

delta_a = [0] * 5
for i in range(5):
    delta_a[i] = (
        (1/18050)
        +
        4 * (
            ((avg_t[i][0]*delta_t[i][0])**2 + ((avg_t[i][1]*delta_t[i][1])**2))
            /
            (avg_t[i][1]**2 - avg_t[i][0]**2)
        )
    )
    delta_a[i] = math.sqrt(delta_a[i])
    delta_a[i] *= a[i]
    delta_a[i] = round(delta_a[i], 3)
avg_s = round(sum(s) / 5, 3)
avg_a = round(sum(a) / 5, 3)
tmp1 = tmp2 = 0
for i in range(5):
    tmp1 += (s[i] - avg_s) * (a[i] - avg_a)
    tmp2 += (s[i] - avg_s)**2
B = round(tmp1/tmp2, 3)
A = round(avg_a - (B*avg_s), 3)
print(A, B)
d = [0] * 5
for i in range(5):
    d[i] = a[i] - (A + (B * s[i]))
D = 0
for i in range(5):
    D += (s[i] - avg_s)**2
tmp1 = 0
for i in range(5):
    tmp1 += d[i]**2
sigma_B = round(math.sqrt(tmp1 / (D * 3)), 3)
print(sigma_B)
delta_B = 4.3 * sigma_B
delta_B = round(delta_B, 3)
print(delta_B)