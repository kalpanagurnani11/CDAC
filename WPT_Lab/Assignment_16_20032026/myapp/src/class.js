import { Component } from "react";
export default class MyClass extends Component{
    constructor()
    {
        super();
        // this.msg="default msg"
        this.state = { username: "", password: "", msg: "" };
        // this.state={msg:"default"}
        this.textHandler=this.textHandler.bind(this);
        this.btnHandler = this.btnHandler.bind(this);
    }
    btnHandler()
    {
        if (this.state.username === "iet" && this.state.password === "iet")
            this.setState({ msg: "Hello " + this.state.username });
        else
            this.setState({ msg: "Invalid" });
        // console.log("text added")

    }
    textHandler(e)

    {
        if (e.target.name === "u")
            this.setState({ username: e.target.value });
        else
            this.setState({ password: e.target.value });
        // console.log(e.target)
        // console.log(e.target.name)
        // console.log(e.target.value)
        // this.setState({msg:e.target.value})
        // this.msg=
    }


    render()
    {
        return <div>

            <h1>from class component</h1>
            <input type="text" name="u" id="i1" placeholder="enter a text" onBlur={this.textHandler} />
            <input type="password" placeholder="enter pasword"></input>
            <input type="button" value="submit" onClick={this.btnHandler}/>
            <h1>{this.state.msg}</h1>
        </div>
    }
}