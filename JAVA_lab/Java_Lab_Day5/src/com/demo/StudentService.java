package com.demo;
import java.util.Scanner;
import java.util.stream.Stream;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class StudentService {
	static Student[] sarr;
	static int count;
	static {
		sarr=new Student[100];
		sarr[0]=new Student(11,"abc",67,78,67,new Date());
		sarr[1]=new Student(12,"pqr",66,77,65,new Date());
		count=2;
	}
	public static boolean addNewStudent()
	{
		Scanner sc =new Scanner(System.in);
		
			System.out.println("enter id");
			int sid=sc.nextInt();
			sc.nextLine();
			System.out.println("enter name");
			String nm=sc.nextLine();
			System.out.println("enter m1");
			float m1=sc.nextFloat();
			System.out.println("enter m2");
			float m2=sc.nextFloat();
			System.out.println("enter m3");
			float m3=sc.nextFloat();
			System.out.println("enter jdate");
			String dt=sc.next();
			
			SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
			Date jdt=null;
			try {
				jdt=sdf.parse(dt);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		
		if(count<sarr.length) {
			sarr[count]=new Student(sid,nm,m1,m2,m3,jdt);
			count++;
			return true;
		}else {
			 System.out.println("array is full");
		      return false;
		}
      
			
	}
	public static Student[] displayAll()
	{
		return sarr;
	}
//		for(Student s:arr)
//		{
//			System.out.println(s);
//		}
//		Stream.of(arr).forEach(s1->System.out.println(s1));
//		Stream.of(arr).forEach(System.out::println);
	
	
	public static Student findById(int id)
	{
		for(int i=0;i<count;i++)
		{
			if(sarr[i].getSid()==id)
			{
				return sarr[i];
			}
		}
		return null;
				
	}
	public static Student[] findByName(String nm)
	
	{
		Student[] arr=new Student[count];
		int i=0;
		for(Student s:sarr)
		{
			if(s!=null)
			{
				if(s.getSname().equals(nm))
						{
					arr[i]=s;
					i++;
						}
				else {
					break;
				}
			}
			if(i>0)
			{
				return arr;
			}
			
		}
		return null;	
	}
	public static boolean updateById(int id,float nm1,float nm2,float nm3)
	{
		Student s1=findById(id);
		if(s1!=null)
		{
			
		s1.setM1(nm1);
		s1.setM2(nm2);
		s1.setM3(nm3);
		return true;
	}
	return false;
	}
	public static int deleteById(int id) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<count;i++)
		{
			if(sarr[i].getSid()==id)
			{
				System.out.println(sarr[i]);
				System.out.println("are u sure u want to delete this record y/n");
				String ans=sc.next();
				if(ans.equals("y"))
				{
					for(int j=i;j<count;j++)
					{
						sarr[j]=sarr[j+1];
						
					}
					count--;
					sarr[count]=null;
						
				return 1;	
				}
				return 2;
				
				
			}
			
			
		}
		return 3;
	}
	
	
	
}
