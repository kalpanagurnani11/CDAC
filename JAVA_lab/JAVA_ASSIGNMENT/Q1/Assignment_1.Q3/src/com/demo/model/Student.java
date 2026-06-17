
	package com.demo.model;

	public class Student {
	    private int studentId;
	    private String name;
	    private double m1, m2, m3;
	    private double gpa;

	    public Student() {}

	    public Student(int studentId, String name, double m1, double m2, double m3) {
	        this.studentId = studentId;
	        this.name = name;
	        this.m1 = m1;
	        this.m2 = m2;
	        this.m3 = m3;
	    }

	   
	    public int getStudentId() { return studentId; }
	    public void setStudentId(int studentId) { this.studentId = studentId; }

	    public String getName() { return name; }
	    public void setName(String name) { this.name = name; }

	    public double getM1() { return m1; }
	    public double getM2() { return m2; }
	    public double getM3() { return m3; }

	    public double getGpa() { return gpa; }
	    public void setGpa(double gpa) { this.gpa = gpa; }

	    @Override
	    public String toString() {
	        return "ID=" + studentId + ", Name=" + name +
	               ", M1=" + m1 + ", M2=" + m2 + ", M3=" + m3 +
	               ", GPA=" + gpa;
	    }
	}


