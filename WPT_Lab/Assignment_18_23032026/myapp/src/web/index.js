import {BrowserRouter,Routes,Route,NavLink,Link} from 'react-router-dom'
import Home from './home'
import About from './about'
import Contact from'./contact'

export default function Index()
{
    return <>
    <BrowserRouter>
    <Routes>
        <Route path="/" element={<Home/>}/>
        <Route path="/about" element={<About/>}/>
        <Route path="/contact" element={<contact/>}/>
        
    </Routes>
    <li>
        <NavLink to="/">Home</NavLink>
    </li>
    <li>
        <Link to="/about">About us</Link>
    </li>
       <li>
        <Link to="/contact">Contact us</Link>
    </li>
    </BrowserRouter>
    </>
}