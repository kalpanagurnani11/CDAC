package com.demo.model;

import java.time.LocalDate;

public class Student {

	private int sid;
	private String name;
	private LocalDate jdate;
	private int m1,m2,m3;
	
	
	public Student() {
		super();
	}
	
	
	public Student(int sid, String name, LocalDate jdate, int m1, int m2, int m3) {
		super();
		this.sid = sid;
		this.name = name;
		this.jdate = jdate;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}


	public int getSid() {
		return sid;
	}


	public void setSid(int sid) {
		this.sid = sid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public LocalDate getJdate() {
		return jdate;
	}


	public void setJdate(LocalDate jdate) {
		this.jdate = jdate;
	}


	public float getM1() {
		return m1;
	}


	public void setM1(int m1) {
		this.m1 = m1;
	}


	public float getM2() {
		return m2;
	}


	public void setM2(int m2) {
		this.m2 = m2;
	}


	public float getM3() {
		return m3;
	}


	public void setM3(int m3) {
		this.m3 = m3;
	}


	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", jdate=" + jdate + ", m1=" + m1 + ", m2=" + m2 + ", m3="
				+ m3 + "]";
	}


	

	
	

}

