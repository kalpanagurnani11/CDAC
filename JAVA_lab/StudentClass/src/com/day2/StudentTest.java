package com.day2;
import java.util.Date;

public class StudentTest {
	public static void main(String[] args)
	{
		Student s=new Student(12,"abc",65,67,78,new Date());
		System.out.println(s);
		Student s1=new Student(11,"xyz",95,87,80,new Date());
		System.out.println(s1);
		
		Student s2=new Student();
		s2.setSid(13);
		s2.setSname("pqr");
		s2.setM1(34);
		s2.setM2(67);
		s2.setM3(78);
		s2.setDate(new Date());
		System.out.println(s2);
		System.out.println(s2.getSid());
		
	}

}
