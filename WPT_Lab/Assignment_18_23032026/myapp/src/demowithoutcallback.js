// import react from "react";
import React,{useState,useCallback} from "react";


    const funcSet=new Set();
    const DemoWithoutcallback=()=>
    {
          const[count,setCount]=useState(0)
    const[num,setNum]=useState(0)

    const incCount=useCallback(()=>setCount(count+1),[count])
    const decCount=useCallback(()=>setCount(count-1),[count])
    const incNum=useCallback(()=>setNum(num+1),[num])

    // console.log(incCount)
    funcSet.add(incCount);
    funcSet.add(decCount)
    funcSet.add(incNum);

    

  
    
    return(
        <>
        <h2>Without callback</h2>
        <button onClick={incCount}>Increase Count</button>
        <button onClick={decCount}>Decrease Count</button>
        <button onClick={incNum}>Increase Num</button>
        <h1>Count:{count}</h1>
        <h1>Number:{num}</h1>
        <h2>Set size:{funcSet.size}</h2>

        </>
    );



};
export default DemoWithoutcallback;