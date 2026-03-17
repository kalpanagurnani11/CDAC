let num1=process.argv.slice(1);
console.log(num1)
let sum=0
for(let i=0;i<num1.length;i++)
{
    let num=parseInt(num1[i])
    if(num%2==0)
    {        sum+=num;

    }
    // console.log(num)
    
}
console.log(sum)