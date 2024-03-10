from bs4  import BeautifulSoup
import requests 
import regex as re 


url = ("https://raw.githubusercontent.com/""joelgrus/data/master/getting-data.html")
html = requests.get(url).text
soup = BeautifulSoup(html, 'html5lib')

#Buscar la primera de alguna etiqueta ademas de obtener su contenido
first_paragraph = soup.find('p')
first_paragraph_text = soup.p.text



print(first_paragraph)
print(first_paragraph_text)


#Obtener las propiedades 
print("----------------")

first_paragraph_id = soup.p['id'] # raises KeyError if no 'id'
first_paragraph_id2 = soup.p.get('id') # returns None if no 'id'

print(first_paragraph_id)
print(first_paragraph_id2)

#obtener varias equiteas  y sus ids
print("----------------")
all_paragraphs = soup.find_all('p') # or just soup('p')
paragraphs_with_ids = [p for p in soup('p') if p.get('id')]


print(all_paragraphs)
print(paragraphs_with_ids)

#Obtener una etiqueta con una clase especifica 
print("----------------")
important_paragraphs = soup('p', {'class' : 'important'})
important_paragraphs2 = soup('p', 'important')
important_paragraphs3 = [p for p in soup('p')
if 'important' in p.get('class', [])]

print(important_paragraphs)
print(important_paragraphs2)
print(important_paragraphs3)


print( soup.p.get('Class',[]))

#Filtrar por medio de expresiones regulares

regex = r"^https?://.*\.house\.gov/?$"
# Let's write some tests!
assert re.match(regex, "http://joel.house.gov")
assert re.match(regex, "https://joel.house.gov")

