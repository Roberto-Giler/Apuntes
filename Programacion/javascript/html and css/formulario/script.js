
const form=document.getElementById("form-prueba")

//Obtener el nodo de html de otro metodo

const form2=document.forms()['form-prueba']



form.addEventListener("submit",(e)=>{
    let errores=[]
    
    if(errores>0){
        e.preventDefault() //cancela el comportamineto por defoult
    } else{
        document.querySelector()
    }

})
eventos 
//focus cursor dentro de un campo dado


const text=document.getElementById("form-label-nombre")
text.addEventListener("focus",(e)=>{
    console.log(this)
})

//blur cursor avandona el campo


//change permite identificar que el calor de un campo cambio


//submit cuando se cliclea un boton o campo sumit. notese que se activa por defecto ej js


//this.value


const formSimulacion=document.getElementById("for-simulacion")

formSimulacion.addEventListener("submit",(e)=>{
    errores=[]
    
    const nombre=document.querySelector("#for-simulacion #nombre")
    const apellido=document.querySelector("#for-simulacion #apellido")

})

