from numpy import random
import matplotlib.pyplot as plt
import seaborn as sns

# Used to describing probability when every event have the same probability of occur.

# parameters
#a: lower bouwn/ default 0.0.
#b: upper bound-default 1.0.
#size: the shape of the returned array

x = random.uniform(size=(2, 3))

sns.displot(random.uniform(size=10000))

plt.savefig("uniform distribucion.jpg",format="jpg")


print(x)



