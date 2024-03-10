
let parrafo=document.querySelector(".prueba")
console.log(parrafo)
parrafo.style.color='green'

let nombre=prompt("¿Cual es tu nombre?")
if (!nombre){
    nombre=""
}

let saludo=document.querySelector(".saludo")

saludo.innerHTML+=`Hola <i>${nombre}</i>, espero la  pases bien`