
// 3) do email validation code 

function chk(){

let e = document.getElementById("e").value;

let at = e.lastIndexOf("@");
let dot = e.lastIndexOf(".");

if(at>0 && dot>at)
document.getElementById("o").innerHTML="Valid";

else
document.getElementById("o").innerHTML="Invalid";

}

