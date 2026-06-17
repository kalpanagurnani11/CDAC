import {useContext} from "react"

import {ctx} from './index'
export default function Home(props)
{
    let homeCtx=useContext(ctx);
    let uname1=homeCtx.username;
    return <>
        <h1>Home Page</h1>
        <p>weilcome</p>
        <p>hello context {uname1}</p>
        

    </>
}