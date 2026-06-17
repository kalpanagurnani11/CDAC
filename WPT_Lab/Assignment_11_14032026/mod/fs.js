const fs=require('fs')

fs.writeFileSync('product.txt',"Laptop 50000\n")

fs.appendFileSync('product.txt',"Mobile 20000\n")

let data=fs.readFileSync('product.txt','utf8')
console.log(data)

fs.writeFile('sample.txt',"Hello Node",(err)=>{
console.log("Async write done")
})

fs.appendFile('sample.txt'," New Data",(err)=>{
console.log("Async append done")
})

fs.readFile('sample.txt','utf8',(err,data)=>{
console.log(data)
})

fs.renameSync('product.txt','products.txt')

let check=fs.existsSync('products.txt')
console.log(check)

fs.mkdirSync('demo')

let files=fs.readdirSync('.')
console.log(files)

fs.rmdirSync('demo')