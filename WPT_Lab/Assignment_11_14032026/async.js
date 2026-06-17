function getData(){
    return new Promise((resolve)=>{
        setTimeout(()=>{
            resolve("Data Loaded")
        },2000)
    })
}

async function show(){
    let d = await getData()
    console.log(d)
}

show()