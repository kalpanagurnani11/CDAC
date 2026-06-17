// 4) understand varargs parameter
function s(...a){
let t=0;

for(let i of a){
t += i;
}

console.log(t);
}

s(10,20);
s(10,20,30,40);