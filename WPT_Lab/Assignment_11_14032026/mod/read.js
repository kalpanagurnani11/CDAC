const fs=require('fs')

let data=fs.readFileSync('sample.txt','utf8')
console.log(data)

fs.readFile('sample.txt','utf8',(err,data)=>{
console.log(data)
})