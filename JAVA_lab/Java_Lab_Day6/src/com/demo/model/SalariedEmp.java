package com.demo.model;

public class SalariedEmp extends Employee {
	private double sal;
	private double bonus;
	
	
	public SalariedEmp() {
		super();
		System.out.println("in salariedEmp default constructor");
	}
	public SalariedEmp(int id, String name, String mob, String dept, String desg,double sal, double bonus) {
		super(id, name, mob, dept, desg);
		System.out.println("in salariedEmp para constructor");
		this.sal = sal;
		this.bonus = bonus;
		
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	public String toString() {
		return super.toString()+"SalariedEmp [sal=" + sal + ", bonus=" + bonus + "]";
	}
	
	public double calculatesal() {
		
		return 0.10*sal+0.15*sal+0.12*sal+bonus;
	}
	
	

}
