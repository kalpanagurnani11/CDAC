package com.day2;
import java.util.Scanner;
import java.util.stream.Stream;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class StudentService {
	public static void addStudent(Student[] arr)
	{
		Scanner sc =new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
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
			
			arr[i]=new Student(sid,nm,m1,m2,m3,jdt);
			
		}
			
	}
	public static void Displayall(Student[] arr)
	{
		for(Student s:arr)
		{
			System.out.println(s);
		}
		Stream.of(arr).forEach(s1->System.out.println(s1));
		Stream.of(arr).forEach(System.out::println);
	}

}
