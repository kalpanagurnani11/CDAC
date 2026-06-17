const fs = require('fs')

class Employee{

constructor(firstName,lastName,email,designation,basicSalary){
this.firstName=firstName
this.lastName=lastName
this.email=email
this.designation=designation
this.basicSalary=basicSalary
}

}

let e1=new Employee("Kalpana","Gurnani","kalpana@gmail.com","Developer",50000)

let data=e1.firstName+" "+e1.lastName+" "+e1.email+" "+e1.designation+" "+e1.basicSalary+"\n"

fs.appendFileSync('Employee.txt',data)