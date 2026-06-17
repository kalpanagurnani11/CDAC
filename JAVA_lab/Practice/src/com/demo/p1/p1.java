package com.demo.p1;

import java.util.Scanner;

public class p1 {
	public static void acceptData(int a[])
	{
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			System.out.println("enter element at index"+i);
			 a[i]=sc.nextInt();
		}
	}

	public static void displayData(int[] a) {
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+"\t");
		}
		
	}

	public static int max(int[] a) {
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		return max;
		
	}

	public static int min(int[] a) {
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
		}
		return min;		
	}

	public static int sum(int[] a) {
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
		sum+=a[i];	
		}
		return sum;
		
		
		
	}

	public static int index(int[] a, int num) {
		for(int i=0;i<a.length;i++)
		{		
		if(a[i]==num)
		{
			return i;
		}
		}
			return -1;
		
		
	}

	public static int[] sum1(int[] a) {
		int b[]=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			b[i]=getDigitSum(a[i]);
		}
		return b;
		
		
	}

	private static int getDigitSum(int num) {
		int sum=0;
		while(num>0) {
			int d=num%10;
			num=num/10;
			sum+=num;
		}
	
		return sum;
	}
	
	

}
