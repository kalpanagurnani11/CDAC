package com.demo.test;

import java.util.Scanner;

import com.demo.model.Employee;
import com.demo.service.EmployeeService;

public class TestEmpArray {
	public static void main(String args[])
	{
		int Choice=0;
		Scanner sc=new Scanner(System.in);
		do {
		System.out.println("1.Add Emp details\n 2.Delete Emp By id\n 3.Update Emp Sal By id\n 4.Display by id \n 5.Display By name \n 6.Calculate net salary \n 7.Display All \n 8.Exit \n Choice");
		Choice=sc.nextInt();
		
		switch(Choice) {
		case 1->
		{
			System.out.println("1.salaried emp \n 2.Contract Emp \n 3.Vendor \n Choice");
			int ch=sc.nextInt();
			boolean status=EmployeeService.addNewEmp(ch);
			if(status)
			{
				System.out.println("Emp added Successfully");
				
			}
			else {
				System.out.println("Emp not added");
			}
		}
		case 2->
		{
			System.out.println("enter id");
			int id=sc.nextInt();
			boolean status=EmployeeService.deleteById(id);
			if(status) {
				System.out.println("employee deleted successfully");
			}else {
				System.out.println("employee not found");
			}
			
		}
		case 3->
		{
			System.out.println("enter id");
			int id=sc.nextInt();
			System.out.println("enter sal");
			Double sal=sc.nextDouble();
			boolean status=EmployeeService.updateById(id,sal);
			if(status)
			{
				System.out.println("Emp sal updated succesfully");
				
			}
			else {
				System.out.println("Emp id not Found");
			}
			
			
		}
		case 4->
		{
			System.out.println("enter id");
			int id=sc.nextInt();
			Employee e=EmployeeService.findById(id);
			if(e!=null)
			{
				System.out.println(e);
			}
			else
			{
				System.out.println("Emp not Found");
			}
			
			
			
		}
		case 5->
		{
			System.out.println("enter name");
			String nm=sc.next();
			Employee[] arr=EmployeeService.findByName(nm);
			if(arr!=null)
			{
				
			
			for(Employee e:arr)
			{
				if(e!=null)
				{
					System.out.println(e);
					
				}
				
				else
				{
					System.out.println("emp not found");
				}
			}
			}
			
		}
		case 6->
		{
			System.out.println("enter id");
			int id=sc.nextInt();
			double netsal=EmployeeService.findNetSalary(id);
			if(netsal!=-1) {
				  System.out.println("Net salary for "+id+ ":" +netsal);
			}else {
				System.out.println("employee not found");
			}
	
			
		}
		case 7->
		{
			Employee[] emparr =EmployeeService.getAll();
			for(Employee e:emparr) {
				if(e!=null) {
					  System.out.println(e);
				}else {
					break;
				}
			}
		}
			
		
		case 8->
		{
		sc.close();
		System.out.println("Thank You");
		}
		default->{
			System.out.println("Wrong choice");
		}
		
		}
	}
		while(Choice!=8);

}
}
