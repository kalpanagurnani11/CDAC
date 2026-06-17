package com.demo;

import java.util.Scanner;

public class Exception2 {
		public static int divide(int a,int b) {
			int ans=a/b;
			return ans;
		}
	public static void main(String[] args) {
		    Scanner sc=new Scanner(System.in);
		    for(int i=1;i<=3;i++) {
					    try {
								    System.out.println("enetr a num");
								    int num1=sc.nextInt();
								    System.out.println("enetr a num2");
								    int num2=sc.nextInt();
								    int ans=divide(num1,num2);
								    System.out.println("Ans: "+ans);
								    break;
					    }catch(ArithmeticException e) {
					    	System.out.println(e.getMessage());
					    	System.out.println("You lost "+i +"attempts");
					    }
		    }

	}

}