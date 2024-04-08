from numpy import random
import matplotlib.pyplot as plt
import seaborn as sns
import  pathlib


url=pathlib.Path(__file__).parent.resolve()



# Pareto distribution is a distributions that following pareto's law.

#   What is it pareto law ?
#   is 80-20 distributionv(20% factors cause and 28% outcome) 
#    to raise up of the observation that 80% of society’s wealth was controlled by 20%

#random.pareto() parameters
    #a: shape parameters   
    #size: the shape of the returned array

nparray_pareto=random.pareto(a=10,size=100)

sns.displot(nparray_pareto)
plt.savefig('./numpy/random_numpy/pareto_distributions.jpg',format='jpg')                                    


# print( os.path.abspath(__file__))














