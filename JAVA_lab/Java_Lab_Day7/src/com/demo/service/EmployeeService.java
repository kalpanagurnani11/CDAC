package com.demo.service;

import java.util.Scanner;

import com.demo.model.ContractEmp;
import com.demo.model.Employee;
import com.demo.model.SalariedEmp;

public class EmployeeService {
	static Employee[] emparr;
	static int count;
	static {
		emparr=new Employee[100];
		emparr[0]=new SalariedEmp(12,"abcd","67899","Hr","mgr",45678,7578);
		emparr[1]=new ContractEmp(13,"jppcd","67899","Hr","mgr",8978,9778);
		count=2;
	}
	

	public static boolean addNewEmp(int ch) {
		Scanner sc=new Scanner(System.in);
		if(count<emparr.length)
		{
			System.out.println("enter id");
			int id=sc.nextInt();
			System.out.println("enter name");
			String name=sc.next();
			System.out.println("enter mob");
			String m=sc.next();
			System.out.println("enter dept");
			String dept=sc.next();
			System.out.println("enter desg");
			String desg=sc.next();
			if(ch==1)
			{
				System.out.println("enter sal");
				Double sal=sc.nextDouble();
				System.out.println("enter bonus");
				Double bonus=sc.nextDouble();
				emparr[count]=new SalariedEmp(id,name,m,dept,desg,sal,bonus);
				
				
			}
			else if(ch==2)
			{
				System.out.println("enter hrs");
				float hrs=sc.nextFloat();
				System.out.println("enter charges");
				double charges=sc.nextDouble();
				emparr[count]=new ContractEmp(id,name,m,dept,desg,hrs,charges);
				
			}
			else if(ch==3) {
				System.out.println("enter no.of emp");
				int numofemp=sc.nextInt();
				System.out.println("enter charges");
				Double charge=sc.nextDouble();
				emparr[count]=new SalariedEmp(id,name,m,dept,desg,numofemp,charge);
			}
			
			System.out.println("count" +count);
			count++;
			System.out.println("after count" +count);
			return true;
		
			
		}
		
		return false;
	}

	public static Employee findById(int id) {
	     int pos=searchById(id);
	     if (pos!=-1) {
	    	 return emparr[pos];
	     }
	     return null;
 }
   private static int searchById(int id) {
	   for(int i=0;i<count;i++) {
		   if(emparr[i].getId()==id) {
			   return i;
		   }
	   }
	   return -1;
   }
	public static Employee[] getAll() {
		return emparr;
		
	}


	public static boolean deleteById(int id) {
		int pos=searchById(id);
		if(pos!=-1)
		{
			for(int i=pos;i<count;i++)
			{
				emparr[i]=emparr[i+1];
					
			}
			count--;
			return true;
			
		}
		return false;
	}

	public static Employee[] findByName(String nm) {
		Employee[] arr=new Employee[count];
		int j=0;
		for(int i=0;i<count;i++)
		{
			if(emparr[i].getName().equals(nm))
			{
				arr[j]=emparr[i];
				
			}
		}
		if(j>0) {
			return arr;	
		}
		return null;
	}

	public static boolean updateById(int id, Double sal) {
		Employee e=findById(id);
		if(e!=null)
		{
			if(e instanceof SalariedEmp)
			{
				((SalariedEmp) e).setSal(sal);
				
			}
			else if (e instanceof ContractEmp)
			{
				((ContractEmp)e).setCharges(sal);
			}
			return true;
		}
		return false;
	}

	public static double findNetSalary(int id) {
		Employee e=findById(id);
		if(e!=null)
		{
			return e.calculatesal();
		}
		return -1;
	}

}
