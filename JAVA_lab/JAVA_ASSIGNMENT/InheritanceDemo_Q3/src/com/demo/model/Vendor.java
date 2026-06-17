package com.demo.model;

public class Vendor extends Employee{
	int numofEmp;
	double chargeperemp;
	
	public Vendor() {
		super();
		System.out.println("in vendor default constructor");
	}
	
	public Vendor(int id,String name,String mob,String dept, String desg,int numofEmp, double chargeperemp) {
		super(id, name, mob, dept, desg);
		System.out.println("in vendor para constructor");
		this.numofEmp = numofEmp;
		this.chargeperemp = chargeperemp;
	}
	
	public int getNumofEmp() {
		return numofEmp;
	}
	
	public void setNumofEmp(int numofEmp) {
		this.numofEmp = numofEmp;
	}
	
	public double getChargeperemp() {
		return chargeperemp;
	}
	
	public void setChargeperemp(double chargeperemp) {
		this.chargeperemp = chargeperemp;
	}
	
	public String toString() {
		return super.toString()+"Vendor [numofEmp=" + numofEmp + ", chargeperemp=" + chargeperemp + "]";
	}

	@Override
	public double calculatesal() {
		
		return chargeperemp+chargeperemp*0.18;
	}
	
	

}
