//operacion que lleven algunos segundos para realizar un proceso


//bloque sincronico


//PROMESAS
// const promesa= new Promise((resolve, reject)=>{
//     setTimeout(
//     if(condicion){
//             resolve('Se pudo resolver la apromesa')
        
//         reject('No se pudo cumplir la promesa')
//     },200)

// })

//Es posible usar el metodo then en el objeto de clase promesa

promesa(true).then((respuesta)=>{
    console.log(respuesta)
}).catch((err)=>{
    console.log(err)
})

// async await, esto permitiré darle el valor cuando obtenga la promesa hasta que obtenga el valor
async function manejarDatos() {
    const respuesta=await promesa(true)
}



//funcion fetch(), es una promesa que retorna el una consulta a un api


