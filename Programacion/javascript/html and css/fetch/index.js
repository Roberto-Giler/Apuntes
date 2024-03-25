window.addEventListener("load",()=>{
    const url = "https:// "
    fetch(url) //será por unu metodo get
    .then(res => res.json)
    .then(data=>{
        console.log(data)
        if(data.length>0){
            const section =document.querySelector("#list-container")
            data.array.forEach(element => {
                section.innerHTML=`
                <div class="card">
                    <h3></h3>
                    <p></p>
                <div>`
            })            
        }
    })
    .catch(err=>console.log(err))


    async function fetxhCarrton(){
        const resp=await fetch(url)
        console.log(resp.json)
    }

    fetch('URI',"Object")




})











