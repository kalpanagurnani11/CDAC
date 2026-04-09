package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.model.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class TestArrayList {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		EmployeeService eservice=new EmployeeServiceImpl();
		int choice =0;
		do {
			System.out.println("1.add new Emp \n 2.delete by id\n 3.update salary\n 4.find by id\n");
			System.out.println("5.display all \n 6.display by name\n 7.calculate sal \n calculate bonus\n");
			System.out.println("9.sort by id \n 10.sort by name \n 11.sort by sal \n 12 exit \n choice:");
			choice=sc.nextInt();
			switch(choice) {
			case 1->
			{
				System.out.println("1.salaried\n2.contract\n3.vendor:");
				int ch=sc.nextInt();
				boolean status=eservice.addNewEmployee(ch);
				if(status)
				{
					System.out.println("added successfullyy");
					
				}
				else {
					System.out.println("not added");
				}
			}
			case 2->
			{
				System.out.println("enter id");
				int id=sc.nextInt();
				boolean status=eservice.deleteById(id);
				if(status)
				{
					System.out.println("deleted successfully");
					
				}
				else
				{
					System.out.println("not found");
					
				}
				
			}
			case 3->
			{
				System.out.println("enter id");
				int id=sc.nextInt();
				System.out.println("enter sal");
				double sal=sc.nextDouble();
				boolean status=eservice.modifyById(id,sal);
				if(status)
				{
					System.out.println("updated successfully");
					
				}
				else
				{
					System.out.println("not found");
					
				}
				
				
			}
			case 4->
			{
				System.out.println("enter id to search");
            	int id=sc.nextInt();
            	Employee e=eservice.getById(id);
            	if(e!=null) {
            		System.out.println(e);
            	}else {
            		System.out.println("not found");
            	}
			}
			case 5->
			{
				List<Employee>lst=eservice.getAll();
				lst.forEach(System.out::println);
				
			}
			case 6->
			{
				System.out.println("enter name");
				String nm=sc.next();
				List<Employee> lst=eservice.getByName(nm);
				lst.forEach(System.out::println);
			}
			case 7->
			{
			
				System.out.println("enter id");
				int id=sc.nextInt();
				double sal=eservice.calculateSal(id);
				System.out.println("salary"+sal);
				
			}
			case 8->
			{
				System.out.println("enter id");
				int id=sc.nextInt();
				double bonus=eservice.calculateBonus(id);
				System.out.println("Bonus"+bonus);
			}
			case 9->
			{
				List<Employee>lst=eservice.sortById();
				lst.forEach(System.out::println);
				
			}
			case 10->
			{
				List<Employee>lst=eservice.sortByName();
				lst.forEach(System.out::println);
				
			}
			case 11->
			{
				List<Employee>lst=eservice.sortBySal();
				lst.forEach(System.out::println);
				
			}
			case 12->
			{
				sc.close();
				System.out.println("Thank You ");
				
			}
			default->
			{
				System.out.println("wrong choice");
			}
			}
			
		}
		while(choice!=12);
	}

}
