// Manipulacion de los atributos de un elmento de html
//source~src

let anyElemeent=document.querySelector("body")


//agrega un atributo con su valor 
anyElemeent.setAttribute("atributo","valor")


//Elimina un atributo con su valor
anyElemeent.removeAttribute("atributo")


//Consulta si posee un atributo
anyElemeent.hasAttribute("atributo"); //retorna un booleano


//obtiene el valor de un atributo
anyElemeent.getAttribute("class")// nota.. obtiene el valor de la primera ocurrencia


anyElemeent.setAttribute("atributo",1)//nota cambia el valor del atributo
console.log(anyElemeent)
