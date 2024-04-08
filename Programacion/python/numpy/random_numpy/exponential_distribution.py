from numpy import random
import matplotlib.pyplot as plt
import seaborn as sns
# exponencial distribution is used for describing tine till next event: failure/success, etc.
# random.exponential(): has two paramenter:
    # scale: inverse of rate.               default is 1
    # size: the shape of  returned array.   default is 1
sns.displot(random.exponential(size=1000))

plt.savefig('./numpy/random_numpy/exponential_distribution.jpg',format='jpg')

print(random.exponential())