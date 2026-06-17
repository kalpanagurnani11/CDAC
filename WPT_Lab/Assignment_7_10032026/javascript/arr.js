let arr = [10,5,8,21,6,3,14,9,2,11];

console.log("array:", arr);


let even = arr.filter(x => x % 2 == 0);
console.log("even nums:", even);


let odd = arr.filter(x => x % 2 != 0);
console.log("odd nums:", odd);


let sorted = [...arr].sort((a,b)=>b-a);
console.log("sorted Arr:", sorted);