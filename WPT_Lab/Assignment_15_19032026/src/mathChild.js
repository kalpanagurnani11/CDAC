// Create ParentComponent 
//    which accept data 2 numbers  and it will display result 
// Create ChildComponent which display options in DropDown Format 
//  add , subtraction , Division , Multiplication 
// after Option Selection onChange display result 
// on ParentComponent


export default function MathChild({num1,num2,a1})
{
   function compute(e)
   {
      switch(e.target.value)
      {
         case "add":let res=num1+num2;
                     a1(res);
                     break;
         case "sub":let r=num1-num2;
                     a1(r);
                     break;
         case "div":let result=num1/num2;
                     a1(result);
                     break;
         case "mul":let re=num1*num2;
                     a1(re);
                     break;



      }
   }
   return<div className="outline">
      <h2> ====== data</h2>
<select onChange={compute}>
   <option value="add">Add</option>
   <option value="sub">Sub</option>
   <option value="div">Div</option>
   <option value="mul">Mul</option>
   </select>   
   </div>
}
