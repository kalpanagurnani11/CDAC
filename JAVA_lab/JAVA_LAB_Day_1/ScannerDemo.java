import java.util.Scanner;
public class ScannerDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num1:");
		int a=sc.nextInt();
		System.out.println("enter num2:");
		double b=sc.nextDouble();
		
		System.out.println("a:"+a+" "+"b:"+b);
		
		System.out.println("enter name:");
		String s=sc.next();
		sc.nextLine();
		System.out.println("enter Address:");
		String add=sc.nextLine();
		System.out.println("name:"+s);
		System.out.println("add:"+add);
		
		
		sc.close();
		
		

	}

}
