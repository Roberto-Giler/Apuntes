

let elementoPadre=document.querySelector("body")
//Manipulacion de nodos
let elementoCreado= document.createElement("div")//Crea un nodo dependiendo la eiqueta que le demos
let textCreado=document.createTextNode("----texto----") // Crea un nodo de texto explicitado entre comillas, que no se mostrará hasta que se asigne a un elemento existente
elementoPadre.appendChild(elementoCreado.appendChild(textCreado)) //Adhiere un elemento hijo a un elemento padre

document.querySelector(".prueba").appendChild()
//textCreado.appendChild(elementoCreado)---nota no es posible cambiarlos
console.log(elementoCreado)

