from matplotlib import pyplot as plt

from collections import Counter

years = [1950, 1960, 1962, 1980, 1990, 2000, 2010]
gdp = [300.2, 543.3, 1075.9, 2862.5, 5979.6, 10289.7, 14958.3]
# create a line chart, years on x-axis, gdp on y-axis
plt.plot(years, gdp, color='green', marker='o', linestyle='solid')
# add a title
plt.title("Nominal GDP")
# add a label to the y-axis
plt.ylabel("Billions of $")

plt.savefig('fig__line.png')



#  plt.show() visual studio code no permite visualizar la figura probablemente con alguna extension pueda
grades = [83, 95, 91, 87, 70, 0, 85, 82, 100, 67, 73, 77, 0]

print(Counter(min(grade // 10 * 10, 90) for grade in grades))

A=[1,2,3]

print(int(2.7))
print(int(2.5))
print(int(2.3))


