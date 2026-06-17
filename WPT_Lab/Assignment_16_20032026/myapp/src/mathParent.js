import { useState } from "react";
import MathChild from "./mathChild";

export default function MathParent()
{
    let[n1,setN1]=useState(0)
    let[n2,setN2]=useState(0)
    let[res,setRe]=useState(0)

    function changeRes(v)
    {
        setRe(v)

    }
    return <div className="outline">
    <input type="number" placeholder="enter num1" onBlur={(e)=>{setN1(e.target.value)}}></input>
    <input type="number" placeholder="enter num2" onBlur={(e)=>{setN2(e.target.value)}}></input>
    <p>Result = {res} </p>
        <MathChild a1={changeRes} num1={parseInt(n1)} num2={parseInt(n2)}> </MathChild> 
    {/* <button onChange={changeRes}> Result</button> */}
    </div>

}

