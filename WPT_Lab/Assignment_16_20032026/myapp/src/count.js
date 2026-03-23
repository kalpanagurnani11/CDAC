import {useState} from "react"
export default function Count()
{
    let i=0;
    let[cnt,setData]=useState(0);

    function handler()
    {
        // i=i+1;
        // console.log(i);
        setData(cnt++)

        }
        return <>
        <h2> count: {cnt}</h2>
        <button onClick={handler}>count</button>

        </>
}