import java.util.Scanner;
public class Test2 {
	public void myfunc()
	{
		System.out.println("in function");
	}
	public static void table(int num)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+"*"+i+"="+(num*i));
		}
	}
	
	public static int fact(int num)
	{
		int f=1;
		for(int i=1;i<=f;i++)
		{
			f*=i;
			
		}
		return f;
	}
	public static void main(String[]args)
	{
		Test2 obj=new Test2();
		obj.myfunc();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a num");
		int num=sc.nextInt();
		table(num);
		int f=Test2.fact(num);
		System.out.println("factorial"+f);
		sc.close();
	}

}
