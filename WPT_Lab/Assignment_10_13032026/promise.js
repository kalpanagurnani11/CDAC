function addition(a,b){
    return new Promise(function(resolve,reject){

        if(b==0){
            reject("Sec para cannot be zero")
        }
        else{
            resolve(a+b)
        }

    })
}

addition(10,5)
.then(function(r){
    console.log(r)
})
.catch(function(e){
    console.log(e)
})