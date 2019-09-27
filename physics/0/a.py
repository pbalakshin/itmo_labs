import matplotlib
import numpy as np
import matplotlib.pyplot as plt
from matplotlib.ticker import FormatStrFormatter

values = np.array([4.97,
4.81,
4.65,
4.51,
4.76,
4.81,
4.57,
4.8,
4.54,
4.78,
4.81,
5.02,
4.84,
4.87,
4.82,
4.60,
4.67,
4.81,
4.91,
4.56,
4.52,
4.80,
4.72,
4.64,
4.71,
4.45,
4.77,
4.87,
4.83,
4.67,
4.70,
4.71,
4.99,
5.12,
4.72,
4.81,
4.52,
4.82,
4.81,
4.70,
4.38,
4.92,
4.74,
4.67,
4.67,
4.96,
4.78,
4.89,
5.1,
4.71])

plt.figure(figsize=(6, 6), dpi=300)
#fig, ax = plt.subplots()
bins = np.arange(0, 6, 0.01)
y = []
for i in bins:
    y.append(
        2.66 *
        np.exp(- ((i - 4.76)**2)/(2 * 0.15 * 0.15)))
plt.plot(bins, y, color='black')
plt.xlim([4.28, 5.22])
n, bins, patches = plt.hist(values, 10, density=1, color = 'aquamarine', edgecolor = 'black')
plt.tight_layout()
plt.show()
