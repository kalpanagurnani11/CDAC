package com.demo.test;

import java.util.Scanner;

import com.demo.model.ContractEmp;
import com.demo.model.Employee;
import com.demo.model.SalariedEmp;
import com.demo.model.Vendor;

public class TestPolymorphism {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Choice to calculate salary \n 1.salariedEmp\n 2.ContractEmp \n 3.vendor\n Choice:");
		int choice=sc.nextInt();
		Employee e=null;
		switch (choice) {
		case 1->
		{
			e=new SalariedEmp(12,"neha","2334","hr","mgr",12000,2000);
			System.out.println(e);
//			System.out.println(e.calculatesal());
		}
		case 2->
		{
			e=new ContractEmp(12,"neha","2334","hr","mgr",45,20000);
			System.out.println(e);
//			System.out.println(e.calculatesal());	
		}
		case 3->
		{
			e=new Vendor(12,"neha","2334","hr","mgr",12,20000);
			System.out.println(e);
//			System.out.println(e.calculatesal());
		}
		case 4->
		{
			sc.close();
		}
		default->
		{
			System.out.println("Thank You");
		}
		
		}
		System.out.println(e.calculatesal());
		
		
		
	}

}
