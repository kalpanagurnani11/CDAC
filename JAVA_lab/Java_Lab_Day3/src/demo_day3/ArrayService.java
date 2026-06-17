package demo_day3;
import java.util.Scanner;

public class ArrayService {
//	int []a=new int[10];
	public static void accept(int[] arr)
	{
		Scanner sc=new Scanner (System.in);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter element"+i);
			arr[i]=sc.nextInt();
			
		}
		
	}
	public static void display(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+"\t");
			
		}
	}
	public static int searchData(int[] arr,int num)
	{
		for(int i=0;i<arr.length;i++)
		{
			if (arr[i]==num)
			{
				return i;
			}
			
		}
		return -1;
	}
	public static int findSum(int[] arr)
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		return sum;
	}
	public static int findMax(int[] arr)
	{
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if (max<arr[i]);
			max=arr[i];
		}
		return max;
	}
	public static int findMin(int[] arr)
	{
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if (min>arr[i]);
			min=arr[i];
		}
		return min;
	}
	public static int getDigitSum(int num)
	{
		int sum=0;
		while(num>0)
		{
			int d=num%10;
			num=num/10;
			sum+=d;
		}
		return sum;
//		num=num%10;
		
		
	}
	public static int[] findDigitSum(int[] b)
	{
		
		int[] arr=new int[b.length];
		for(int i=0;i<b.length;i++) {
			arr[i]=getDigitSum(b[i]);
		}
		return arr;
		
//		int addition=0;
//		return sum;
	}
	
	

}