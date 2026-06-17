//Write a program to maintain student information. For each student store studid, name, m1,
//m2 and m3 (marks of 3 subjects ). Accept information for 2 students and display it as
//follows.
package com.demo;

import java.util.Scanner;

public class StudentData {
	int studid;
	String name;
	int m1;
	int m2;
	int m3;
	

	public void AcceptData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter students details in (studid,name,m1,m2,m3");
		studid=sc.nextInt();
		name=sc.nextLine();
		m1=sc.nextInt();
		m2=sc.nextInt();
		m3=sc.nextInt();
					
	}

	public StudentData(int studid, String name, int m1, int m2, int m3) {
		super();
		this.studid = studid;
		this.name = name;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}

	public String toString() {
		return "StudentData [studid=" + studid + ", name=" + name + ", m1=" + m1 + ", m2=" + m2 + ", m3=" + m3 + "]";
	}
}
