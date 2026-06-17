const fs=require('fs')

fs.writeFileSync('product.txt','Laptop 50000')

fs.writeFile('product.txt','Mobile 20000',(err)=>{
console.log("Data Written")
})