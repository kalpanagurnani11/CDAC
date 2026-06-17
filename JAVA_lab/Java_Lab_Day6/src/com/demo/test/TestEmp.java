package com.demo.test;

import com.demo.model.ContractEmp;
import com.demo.model.Employee;
import com.demo.model.SalariedEmp;
import com.demo.model.Vendor;

public class TestEmp {
	public static void main(String[]args) {
//		Employee e=null;
		SalariedEmp se=new SalariedEmp(12,"neha","2334","hr","mgr",12000,2000);
		System.out.println(se);
		System.out.println("salary is"+se.calculatesal());
		
		ContractEmp ce=new ContractEmp(12,"neha","2334","hr","mgr",45,20000);
		System.out.println(ce);
		System.out.println("salary is"+ce.calculatesal());
		
		Vendor v=new Vendor(12,"neha","2334","hr","mgr",45,20000);
		System.out.println(v);
		System.out.println("salary is"+v.calculatesal());
		
		
	}

}
