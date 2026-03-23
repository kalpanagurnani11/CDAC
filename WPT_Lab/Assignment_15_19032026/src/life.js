import {Component} from "react";
export default class Life extends Component{
    constructor()
    {
        super();
        console.log("constructor")
    }

    static getDerivedStateFromProps()
    {
        console.log("getDerivedStateFromProps")
    }
    componentDidMount()
    {
        console.log("componentDidMount")

    }
    render()
    {
        console.log("render")
        return<>
        </>
    }
}