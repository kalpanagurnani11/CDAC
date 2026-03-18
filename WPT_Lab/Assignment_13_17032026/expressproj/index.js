// // const express=require('express')
// // // const fs=require('fs')

// // const app=express();

// // app.get('/',(req,res)=>
// // {
// //     res.send("express")
// // }
// // )
// // app.listen(3030)
// explore the programs which is demonstrate in lecture

// 1) using express js create rest api for product 
// which contains product details 

// "prodid":1,"ProductName":"Laird","price":2000

// create product.json file which contains at least 5 product 

// then create multiple route

// GET  / ------------ display all products 
// GET /:id ---------- display prodcut with id 
// POST  /add ---------------  add product using param
// POST /insert ------------  add product using body data 
// DELETE /:id  -------------- Delete particular product 
const e = require("express")
const f = require("fs")

const app = e()

app.use(e.json())

app.get("/", (req, res) => {
    let d = JSON.parse(f.readFileSync("product.json"))
    res.send(d)
})

app.get("/:id", (req, res) => {
    let d = JSON.parse(f.readFileSync("product.json"))
    let p = d.find(x => x.prodid == req.params.id)
    res.send(p || "not found")
})

app.post("/add", (req, res) => {
    let d = JSON.parse(f.readFileSync("product.json"))
    let p = {
        prodid: +req.query.prodid,
        prodname: req.query.prodname,
        pri: +req.query.pri
    }
    d.push(p)
    f.writeFileSync("product.json", JSON.stringify(d))
    res.send("added")
})

app.post("/insert", (req, res) => {
    let d = JSON.parse(f.readFileSync("product.json"))
    d.push(req.body)
    f.writeFileSync("product.json", JSON.stringify(d))
    res.send("inserted")
})

app.delete("/:id", (req, res) => {
    let d = JSON.parse(f.readFileSync("product.json"))
    d = d.filter(x => x.prodid != req.params.id)
    f.writeFileSync("product.json", JSON.stringify(d))
    res.send("deleted")
})

app.listen(3030)