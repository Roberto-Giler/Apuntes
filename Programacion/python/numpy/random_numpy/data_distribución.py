# What os data distribucion?

# Data Distribution is a list of all possible values, and how often each value occurs.

from numpy import random
from itertools import groupby


distribucion_p=[0.1, 0.3, 0.6, 0.0]
x = random.choice([3, 5, 7, 9], p=distribucion_p, size=(100))

print(x)

