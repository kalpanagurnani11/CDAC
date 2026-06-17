import {useContext} from "react"
import {ctx} from './index'

export default function About(props)
{
    let actx=useContext(ctx);
    let u= actx.username
    return<>
   
    <h1>About Us Page</h1>
    <h2>hello {u}</h2>
     </>
}