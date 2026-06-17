package com.demo.model;

public class ContractEmp extends Employee {
	float hours;
	double charges;
	
	
	public ContractEmp() {
		super();
		System.out.println("in contractEmp default constructor");
		
	}
	public ContractEmp(int id, String name, String mob, String dept, String desg,float hours, double charges) {
		super(id, name, mob, dept, desg);
		System.out.println("in contractEmp para constructor");
		this.hours = hours;
		this.charges = charges;
	}

	

	public float getHours() {
		return hours;
	}


	public void setHours(float hours) {
		this.hours = hours;
	}


	public double getCharges() {
		return charges;
	}


	public void setCharges(double charges) {
		this.charges = charges;
	}


	

	
	public String toString() {
		return super.toString()+"ContractEmp [hours=" + hours + ", charges=" + charges + "]";
	}
	@Override
	public double calculatesal() {
		// TODO Auto-generated method stub
		return hours*charges;
	}
	
	
	}
	
