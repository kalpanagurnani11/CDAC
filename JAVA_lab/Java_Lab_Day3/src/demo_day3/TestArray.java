
package demo_day3;
import java.util.Scanner;

public class TestArray {
	public static void main(String[] args)
	{
		int[] a=new int[10];
		int[] b= {34,55,67,89};
		int[] summarr=ArrayService.findDigitSum(b);
		for(int i=0;i<summarr.length;i++) {
			System.out.println("sum of digt of num  : "+b[i]+"---->"+summarr[i]);
		}
		
		Scanner sc=new Scanner(System.in);
		ArrayService.accept(a);
		ArrayService.display(a);
		System.out.print("enter num to search");
		int num=sc.nextInt();
		int pos =ArrayService.searchData(a,num);
		if(pos!=-1) {
			System.out.print("num found at : "+pos);
		}else {
			System.out.print("num not found");
			
		}
		int s=ArrayService.findSum(a);
		System.out.println("sum: "+s);
		int max=ArrayService.findMax(a);
		int min=ArrayService.findMin(a);
		System.out.println("Max: "+max+" Min : "+min);
       sc.close();
	}

}
		
	