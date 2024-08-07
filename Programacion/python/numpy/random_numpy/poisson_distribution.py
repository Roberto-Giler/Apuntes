# 
from numpy import random
import matplotlib.pyplot as plt
import seaborn as sns

# Poisson distribution is a Discrete Distribution te estamestes how many times an event can happen in a specified time.

#random,poisson()
# It has two parameters:
    # lam - rate or known number of occurrences e.g. 2 for above problem.
    # size - The shape of the returned array.

x = random.poisson(lam=2, size=10)
print(x)

sns.displot(random.poisson(lam=2, size=1000))

plt.savefig("binomia distribution.jpg",format="jpg")

