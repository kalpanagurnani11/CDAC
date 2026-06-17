export default function Data()
{
    function call()
    {
        console.log("button clicked")
        alert("clicked")
       
        // confirm(btn clicked ok)
        return("button clicked")
    }
    return<div>
        <input type="text" name="n1"></input>
        <button onClick={call}>click</button>
    </div>
}