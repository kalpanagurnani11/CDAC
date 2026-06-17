function add(a,b){
    return a+b
}

function sub(a,b){
    return a-b
}

function multiply(a,b){
    return a*b
}

function div(a,b){
    return a/b
}

function res(a1,a2,callback){
    let r=callback(a1,a2)
    console.log(r)
}

result(10,5,add)
result(10,5,sub)
result(10,5,multiply)
result(10,5,div)