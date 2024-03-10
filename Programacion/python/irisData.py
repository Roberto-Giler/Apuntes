import requests
import random
data = requests.get(
"https://archive.ics.uci.edu/ml/machine-learning-databases/iris/iris.data"
)

with open('iris.dat', 'w') as f:
    f.write(data.text)
           


random.seed()
print(random.randint())       
          
           
            
            





                
              
     

           
