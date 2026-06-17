function normal(){
    console.log("Normal Func")
}

normal()

setTimeout(function(){
    console.log("setTimeout Funct")
},0)

Promise.resolve().then(function(){
    console.log("Promise Funct")
})

console.log("HII")