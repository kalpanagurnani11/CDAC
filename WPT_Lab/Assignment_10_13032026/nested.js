function first(cb){
    console.log("First func")

    cb(function(){
        console.log("Second func")
    })
}

first(function(next){
    console.log("Callback 1")
    next()
})