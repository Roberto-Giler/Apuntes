#las funciones son de primera clases es decir son objetos y para escribir una es con def
def cout(n) :
    for i in range(0,n):
        print(i)

#funciones anonimas o lambdas
rango=lambda n: range(0,n)


#darle valores por defectos
def my_print(message = "my default message"):
    print(message)

my_print()
