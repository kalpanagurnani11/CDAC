// <!-- Declare variable which contains array Data 

// let data  = ['C' , 'C++' , 'Java' , 'AdvJava' , 'WPT']

// display above variable data in Dropdown format 
//  on html page  -->

export default function Drop()
{
    let data=['C' , 'C++' , 'Java' , 'AdvJava' , 'WPT']
    function dropdown()
    {
        let d=[]
         for(let i=0;i<data.length;i++)
    {
        let drop=<option value={data[i]}> {data[i]}</option>
        d.push(drop)

    }
    return d;
    

    }
     function show(e)
    {
        alert("selected"+e.target.value)
    }
   
   


    return <>
    <h2>DropDown</h2>
   <select onChange={show}>
        {dropdown()}
    </select>
    {/* <button onClick={show}> Show</button> */}

    </>
}


//  export default function Drop()
// {
//     let data = ['C' , 'C++' , 'Java' , 'AdvJava' , 'WPT']

//     function dropdown()
//     {
//         let d = []
//         for(let i = 0; i < data.length; i++)
//         {
//             let drop = <option value={data[i]}> {data[i]} </option>
//             d.push(drop)
//         }
//         return d
//     }

//     function show(e)
//     {
//         alert("Selected: " + e.target.value)
//     }

//     return <>
//         <h2>DropDown</h2>

//         <select onChange={show}>
//             {dropdown()}
//         </select>

       
//     </>
// }