package demo.student;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

public class StudentService {
	public static void addStudent(Stud[] arr)
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
			jdt=sdf.parse(dt);
			
			arr[i]=new Studz(sid,nm,m1,m2,m3,jdt);
			
		}
			
	}

}
