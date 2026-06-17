import express from 'express'
let app = express()
import path from "path"

app.set('views', './views')
app.set('view engine', 'hbs')

import bodyParser from 'body-parser'
app.use(bodyParser.urlencoded({ extended: true }))

app.get("/", (req, res) => {
    res.render("index")
})

app.post("/check", (req, res) => {
let n = req.body.num
let sum = 0

for(let i = 1; i < n; i++){
    if(n % i == 0){
        sum = sum + i
    }
}

let ans

if(sum == n){
    ans = "Perfect Num"
}else{
    ans = "Not Perfect Num"
}
    res.render("index", { result: ans })
})

app.listen(2500, () => {
    console.log("server runs on port 2500")
})