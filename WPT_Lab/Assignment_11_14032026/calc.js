export function calculate(d){

let sum=0

for(let i=0;i<d.length;i++){
if(!isNaN(d[i])){
sum=sum+parseInt(d[i])
}
}

return sum
}