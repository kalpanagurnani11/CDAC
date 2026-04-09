package com.demo.model;

public class ContractEmp extends Employee {
	float hrs;
	double charges;
	
	
	public ContractEmp() {
		super();
		System.out.println("in contractEmp default constructor");
		
	}
	public ContractEmp(int id, String name, String mob, String dept, String desg,float hrs, double charges) {
		super(id, name, mob, dept, desg);
		System.out.println("in contractEmp para constructor");
		this.hrs = hrs;
		this.charges = charges;
	}

	

	public float getHours() {
		return hrs;
	}


	public void setHours(float hrs) {
		this.hrs = hrs;
	}


	public double getCharges() {
		return charges;
	}


	public void setCharges(double charges) {
		this.charges = charges;
	}


	

	
	public String toString() {
		return super.toString()+"ContractEmp [hours=" + hrs + ", charges=" + charges + "]";
	}
	@Override
	public double calculatesal() {
		// TODO Auto-generated method stub
		return hrs*charges;
	}
	
	
	}
	
