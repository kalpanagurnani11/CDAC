package com.demo.test;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.demo.model.Vehicle;
import com.demo.service.VehicleService;
import com.demo.service.VehicleServiceImpl;

public class TestVehicle {

	public static void main(String[] args) {
		VehicleService vservice=new VehicleServiceImpl();
		Scanner sc=new Scanner(System.in);
		int choice=0;
		do {
			System.out.println("1. Add New Vehicle \n 2. Delete By id \n "
					+ "3. Modify Price by Id \n 4. Display All \n 5. Display By Id \n 6. Display By Name \n 7. Display By Price \n"
					+ "8. Sort By Id \n 9. Sort By Name \n 10. Sort By Price \n 11. Exit \n Enter Choice:");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1->{
			boolean status=vservice.addVehicle();
			if(status)
			{
				System.out.println("added");
				
			}
			else {
				System.out.println("not added or duplicate id");
			}
			
		}
		case 2->{
			System.out.println("enter id");
			int id=sc.nextInt();
			boolean status=vservice.deleteVehicle(id);
			if(status)
			{
				System.out.println("deleted");
				
			}
			else {
				System.out.println("not deleted" );
			}		
		}
		case 3->{
			System.out.println("enter id");
			int id=sc.nextInt();
			System.out.println("enter sal");
			double sal=sc.nextDouble();
			boolean status=vservice.updateVehicle(id,sal);
			if(status)
			{
				System.out.println("updated");
				
			}
			else {
				System.out.println("not updated" );
			}
			
		}
		case 4->{
			List<Vehicle>vlist=vservice.getAll();
			vlist.forEach(System.out::println);
			
			
		}
		case 5->{
			System.out.println("enter id");
			int id=sc.nextInt();
			Vehicle v=vservice.getById(id);
			if(v!=null) {
				System.out.println(v);
			}
				else
				{
					System.out.println("not found");
				}
			}
					
				
		case 6->{
			System.out.println("enter name");
			String nm=sc.next();
			List<Vehicle>vlist=vservice.getByName(nm);
			if(vlist!=null)
			{
				vlist.forEach(System.out::println);
			}
			else {
				System.out.println("not found");
			}
		}
		
		case 7->{
			System.out.println("enter price");
			double price=sc.nextDouble();
			List<Vehicle>vlist=vservice.getByPrice(price);
			if(vlist!=null)
			{
				vlist.forEach(System.out::println);
			}
			else {
				System.out.println("not found");
			}
		}
	
		case 8->{
			Map<Integer,Vehicle>vmap=vservice.sortById();
			vmap.forEach((k,v)->System.out.println(v));
			
		}
		case 9->{
			List<Vehicle>vlist=vservice.sortByName();
			vlist.forEach(System.out::println);
			
		}
		case 10->{
			List<Vehicle>vlist=vservice.sortByprice();
			vlist.forEach(System.out::println);
			
		}
		case 11->{
			sc.close();
			System.out.println("thank you");
			
		}
		default->{
			System.out.println("wrong choice");
			
		}
		
		}
		}
		while(choice!=11);
	}

}
