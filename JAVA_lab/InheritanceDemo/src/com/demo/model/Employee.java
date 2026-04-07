package com.demo.model;

public abstract class Employee extends Person {
	
	private String dept;
	private String desg;
	
	abstract public double calculatesal();
	
	public Employee() {
		super();
		System.out.println("in Employee default constructor");

	}

	public Employee(int id,String name,String mob,String dept, String desg) {
		super(id,name,mob);
		System.out.println("in Employee para constructor");
		this.dept = dept;
		this.desg = desg;
	}
public Employee(int id)
{
	super(id);
}
	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getDesg() {
		return desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}

	
	public String toString() {
		return super.toString()+ "Employee [dept=" + dept + ", desg=" + desg + "]";
	}
	
	
	
	

}
