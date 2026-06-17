import {createRef,useState} from "react"
export default function Contact(props)
{
    let n=100;
    let n2=createRef(101);
    let[n1,setN1]=useState(100);
    return<>
        <h1>Contact Us Page</h1>
        <h2>email</h2>
        <h2>hello {props.user}</h2>
        <h2>{n2.current}</h2>
        <h2>{n2.prev}</h2>
    </>
}