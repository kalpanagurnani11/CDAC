package com.demo.p1;

import java.util.Scanner;

public class p1Test {
	public static void main(String args[])
	{
		int a[]=new int[10];
		Scanner sc=new Scanner(System.in);
		p1.acceptData(a);
		p1.displayData(a);
		int max=p1.max(a);
		System.out.println(max);
		int min=p1.min(a);
		System.out.println(min);
		int sum=p1.sum(a);
		System.out.println(sum);
		System.out.println("enter index");
		int num=sc.nextInt();
		int pos=p1.index(a,num);
		System.out.println(pos);
		int[] sum1=p1.sum1(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(sum1[i]+"\t");
		}
		
	}

}
