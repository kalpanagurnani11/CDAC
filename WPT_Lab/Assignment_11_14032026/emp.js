export class emp{

constructor(firstName,lastName,email,designation,basicSalary){
this.firstName=firstName
this.lastName=lastName
this.email=email
this.designation=designation
this.basicSalary=basicSalary
}

setFirstName(v){this.firstName=v}
getFirstName(){return this.firstName}

setLastName(v){this.lastName=v}
getLastName(){return this.lastName}

setEmail(v){this.email=v}
getEmail(){return this.email}

setDesignation(v){this.designation=v}
getDesignation(){return this.designation}

setSalary(v){this.basicSalary=v}
getSalary(){return this.basicSalary}

display(){
console.log(this.firstName,this.lastName,this.email,this.designation,this.basicSalary)
}

}