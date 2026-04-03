package com.demo;
import java.util.Scanner;

public class TestStudentMgmt{
			public static void main(String [] args)
			{
				int choice=0;
				Scanner sc=new Scanner(System.in);
				do {
						System.out.println("1. Add \n2. Delete by id\n3.update by id\n4.display all");
						System.out.println("5. display by id\n6. display by name\n7. exit\nchoice:");
						choice=sc.nextInt();
						switch(choice) {
						case 1->{
							boolean status=StudentService.addNewStudent();
							if (status) {   
								System.out.println("student added successfully");
							}else {
								System.out.println("student not added");
							}
						}
						
						
				
						case 2->{
							System.out.println("enter id to delete");
							int id=sc.nextInt();
							int flag=StudentService.deleteById(id);
							if(flag==1) {
								System.out.println("Found and deleted ");
							}else if(flag==2){
								System.out.println("Found and not deleted ");
							}else {
								System.out.println("not found");
							}
						}
						case 3->{
							System.out.println("enter id to update data");
							int id=sc.nextInt();
							System.out.println("enter new m1");
							float nm1=sc.nextFloat();
							System.out.println("enter new m2");
							float nm2=sc.nextFloat();
							System.out.println("enter new m3");
							float nm3=sc.nextFloat();
							boolean status=StudentService.updateById(id,nm1,nm2,nm3);
							if(status) {
								System.out.println("updation done");
							}else {
								System.out.println("not found");
							}
							
						}
						case 4->{
							Student[] arr=StudentService.displayAll();
							for(Student s:arr) {
								if(s!=null) {
									System.out.println(s);
								}else {
									break;
								}
							}
						}
						case 5->{
							System.out.println("enter id to search");
							int id=sc.nextInt();
							Student s=StudentService.findById(id);
							if(s!=null) {
								System.out.println(s);
							}else {
								System.out.println("not found");
							}
						}
						case 6->{
							System.out.println("Enter name to search");
							String nm=sc.next();
							Student[] arr=StudentService.findByName(nm);
							if(arr!=null) {
								for(Student s:arr) {
									if(s!=null) {
										System.out.println(s);
									}else {
										break;
									}
								}
							}else {
								System.out.println("not found");
							}
						}
						case 7->{
							sc.close();
							System.out.println("thank you" );
						}
						default->{
							System.out.println("Wrong choice");
						}
						}
				
				
				}while(choice!=7);

			}

		}







