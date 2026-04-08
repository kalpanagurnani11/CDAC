package com.demo.test;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.demo.model.Vehicle;
import com.demo.service.VehicleService;
import com.demo.service.VehicleServiceImpl;

public class TestVehicle {
	public static void main(String[] args) {
		int choice=0;
		Scanner sc=new Scanner(System.in);
		VehicleService vservice=new VehicleServiceImpl();
		do {
		System.out.println("1.Add Vehicle\n 2.Delete By Id \n 3.Modify By Id \n 4.Display All \n 5.Display By Id \n 6.Display By name \n 7.Display By price \n 8.Sort By Id \n 9.Sort By Name 10.Sort By date \n 11.Exit");
		 choice=sc.nextInt();
		switch(choice){
		case 1->
		{
			boolean status=vservice.addNewVehicle();
			if(status)
			{
				System.out.println("vehicle added");	
			}
			else
			{
				System.out.println("not added");
			}
			
		}
		case 2->
		{
			System.out.println("enter id to delete");
			int id=sc.nextInt();
			boolean status=vservice.deleteById(id);
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
			System.out.println("enter id to update");
			int id=sc.nextInt();
			System.out.println("enter price");
			double price=sc.nextDouble();
			boolean status=vservice.updateById(id,price);
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
			Set <Vehicle> vs=vservice.getAll();
			vs.forEach(System.out::println);
			
		}
		case 5->
		{
			System.out.println("enter id");
			int id=sc.nextInt();
			Vehicle v=vservice.getById(id);
			if(v!=null) {
				System.out.println(v);	
			}
			else
			System.out.println("not found");
		}
		case 6->
		{
			System.out.println("enter name");
			String nm=sc.next();
			
			
		}
		case 7->
		{
		System.out.println("enter price to search");
		double price=sc.nextDouble();
		List<Vehicle> lst=vservice.getByPrice(price);
		if(lst!=null) {
			lst.forEach(System.out::println);
		}
		else
		{
			System.out.println("not found");
		}
		}
		case 8->
		{
			Set<Vehicle>vset=vservice.sortById();
			vset.forEach(System.out::println);
		}
		case 9->
		{
			List<Vehicle>vset=vservice.sortByName();
			vset.forEach(System.out::println);
		}
		case 10->
		{
			List<Vehicle>vset=vservice.sortByPrice();
			vset.forEach(System.out::println);
		}
		case 11->
		{
			sc.close();
			System.out.println("Thank You");
		}
		default->
		{
			System.out.println("Wrong Choice");
		}
			
		}
		}
		while(choice!=11);
		
		
	}

}
