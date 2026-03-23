#include<iostream>
using namespace std;
class Employee
{
	int id;
	public:
	Employee()
	{
		cout<<"zero argument Employee const is called\n";
		id=0;
	}
	Employee(int id)
	{
		cout<<" Employee para const is called\n";
		this->id=id;
	}
	void display()
	{
		cout<<"id of an employee is "<<id<<endl;
	}
	virtual int computeSalary()
	{
		return 0;
	}
	
};
class WageEmployee:public Employee
{
	int hrs,rate;
	public:
	WageEmployee()
	{
		cout<<"zero argument WageEmployee const is called\n";
		hrs=rate=0;
	}
	WageEmployee(int id,int hrs,int rate):Employee(id)
	{
		cout<<" WageEmployee para const is called\n";
		this->hrs=hrs;
		this->rate=rate;
	}
	void display()
	{
		Employee::display();
		cout<<"hrs of an employee is "<<hrs<<endl;
		cout<<"rate of an employee is "<<rate<<endl;
	}
	int computeSalary()
	{
		return hrs*rate;
	}
};
class SalesPerson:public WageEmployee
{
	int sales,comm;
	public:
	SalesPerson()
	{
		cout<<"zero argument SalesPerson const is called\n";
		sales=comm=0;
	}
	SalesPerson(int id,int hrs,int rate,int sales,int comm)
	:WageEmployee(id,hrs,rate)
	{
		cout<<" SalesPerson para const is called\n";
		this->sales=sales;
		this->comm=comm;
	}
	void display()
	{
		WageEmployee::display();
		cout<<"sales of an employee is "<<sales<<endl;
		cout<<"comm of an employee is "<<comm<<endl;
	}
	int computeSalary()
	{
		return   WageEmployee::computeSalary()+(sales*comm);
		
	}
};

int main()
{
	// CASE 1
		// Employee*ptr;
		// Employee e1(101);
		// ptr=&e1;
		// cout<<ptr->computeSalary();
		// WageEmployee WE1(101,10,1000);
		// ptr=&WE1;
		// cout<<ptr->computeSalary();
		// SalesPerson SP1(101,10,1000,10,20);
		// ptr=&SP1;
		// cout<<ptr->computeSalary();

	// case2
    // Employee* ptr;
    // ptr = new Employee(101);
    // cout << ptr->computeSalary() << endl;
    // ptr = new WageEmployee(101,10,1000);
    // cout << ptr->computeSalary() << endl;    
    // ptr = new SalesPerson(101,10,1000,10,20);
    // cout << ptr->computeSalary() << endl;

	// //CASE3
	// Employee* ptr;
    // WageEmployee WE1(101,10,1000); 
    // ptr = &WE1;
    // cout << ptr->computeSalary();
    // SalesPerson SP1(101,10,1000,10,20); 
    // ptr = &SP1;
    // cout << ptr->computeSalary();

	// CASE 4
	Employee* ptr;
	ptr = new WageEmployee(101,10,1000);
    cout << ptr->computeSalary();
    ptr = new SalesPerson(101,10,1000,10,20); 
    cout << ptr->computeSalary();


    




}

