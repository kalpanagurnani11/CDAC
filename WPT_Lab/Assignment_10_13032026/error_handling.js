function multiply(a,b,cb){
    if(b==0){
        cb("Sec para cannot be zero",null)
    }
    else{
        cb(null,a*b)
    }
}

function divide(a,b,cb){
    if(b==0){
        cb("Sec para cannot be zero",null)
    }
    else{
        cb(null,a/b)
    }
}

function result(error,res){
    if(error){
        console.log(error)
    }
    else{
        console.log(res)
    }
}

multiply(10,5,result)
divide(10,0,result)