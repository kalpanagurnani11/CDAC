import {BrowserRouter,Routes,Route,NavLink,Link} from 'react-router-dom'
import Home from './home'
import About from './about'
import Contact from'./contact'
import { createContext } from 'react'
import Info from "./info";

export let ctx='';




export default function Index(props)
{
    ctx=createContext();
    return <>

    <ctx.Provider value={{username:props.user}}>
    <h2>Data {props.user}</h2>


        <BrowserRouter>
    <Routes>
        <Route path="/" element={<Home/>}/>
        <Route path="/about" element={<About/>}/>
        <Route path="/info" element={<Info />} />
        <Route path="/contact" element={<contact user={props.user}/>}/>
        
    </Routes>
    <li>
        <NavLink to="/">Home</NavLink>
    </li>
    <li>
        <Link to="/about">About us</Link>
    </li>
    <li>
        <NavLink to="/info">Info</NavLink>
    </li>
       <li>
        <Link to="/contact">Contact us</Link>
    </li>
    </BrowserRouter>
    </ctx.Provider>
    
    </>
}