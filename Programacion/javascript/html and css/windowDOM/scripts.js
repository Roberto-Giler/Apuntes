 // window nos permite controlar la ventana xdxd

 //metodos mas comunes

window.innerWidth // es la variable donde se almacena el ancho
window.innerHeight // es la variable donde se almacena el alto

console.log(window.innerWidth)
console.log(window.innerHeight)


function abrirPagina(ruta){ 
    window.open(ruta) //abre una de la direccion proporcionada
}



console.log(window.screenX,window.screenY)


// document
// metodos mas comunes 

document.getElementsById('')
document.getElementsByClassName('')
document.getElementsByTagName('div')

document.querySelectorAll('p') //Selceccionara todos los metodos


// style para cambiar el color

const nav=document.getElementsById('menu')

nav[0].style.flexDirection+='colum'
const name= "Roberto"
const mensaje=document.getElementById("mensaje1")

console.log(`hola, soy ${nombre} y tengo ${age} años`)

const contenidoDiv=`
    <h2> Hola, soy ${name} </h2>
    <p>>tengo ${age} años</p>
`
mensaje.innerHTML+=contenidoDiv


const contenedorArticulos= document.getElementsByClassName("contenedorArticulos")
contenedorArticulos[0].innerHTML+=('titulo 1')

// Añadir y Remover ClassNames



//crear elmentos

let newP=document.createElement('p')

newP.textContent="Eso es un ejemplo de crear"

const divAppend=document.getElementById("Ejemplo_create")

divAppend.appendChild(newP)

function generarElmentos(titulo, descripcion){
    let h2=document.createElement('h2')
    h2.textContent=titulo
    let h4=document.createElement('h4')
    h4.textContent=descripcion
    return h2
}

divAppend.appendChild(generarElmentos('Articulo 1 generado','este es el contenido'))


//¿Que es un template string?


