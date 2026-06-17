package com.demo.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.demo.model.Student;
import com.demo.service.StudentService;
import com.demo.service.StudentServiceImpl;

public class TestStudent {
	public static void main(String args[]) {
		Scanner sc=new Scanner (System.in);
		int choice=0;
		do {
		System.out.println("1.Add Student\n2.Delete By Id\n3.Modify By Id\n4.Display All\n5.Display By Id\n6.Display By name\n7.Sort By Id\n 8.Sort By Name\n9.Sort By m1\n 10.Exit\nEnter Choice:");
		choice=sc.nextInt();
		StudentService sservice=new StudentServiceImpl();
		switch(choice) {
		case 1->
		{
			boolean status=sservice.addStudent();
			if(status)
			{
				System.out.println("added");
			}
			else
			{
				System.out.println("not added");
			}
			
		}
		case 2->
		{
			System.out.println("enter id");
			int id=sc.nextInt();
			boolean status=sservice.deleteById(id);
			if(status)
			{
				System.out.println("deleted");
			}
			else
			{
				System.out.println("not deleted");
			}
		}
		case 3->
		{
			
		}
		case 4->
		{
			List<Student>vlst=sservice.findAll();
			vlst.forEach(System.out::println);
			
			
		}
		case 5->
		{
			System.out.println("enter id");
			int id=sc.nextInt();
			Student s=sservice.findById(id);
			if(s!=null)
			{
				System.out.println(s);
			}
			else {
				System.out.println("not found");
			}
			
		}
		case 6->
		{
			System.out.println("enter name");
			String nm=sc.next();
			List<Student>slst=sservice.findByName(nm);
			slst.forEach(System.out::println);
		}
		
		case 7->
		{
			List<Student>slst=sservice.sortById();
			slst.forEach(System.out::println);
			
			
		}
		case 8->
		{
			List<Student>slst=sservice.sortByName();
			slst.forEach(System.out::println);
			
			
		}
		case 9->
		{
			List<Student>slst=sservice.sortByMarks();
			slst.forEach(System.out::println);
				
		}
		case 10->
		{
			sc.close();
			System.out.println("thank you");
			
		}
		default->
		{
			System.out.println("wrong choice");
		}
		}
		
		}
		while(choice!=10);
		}
	}