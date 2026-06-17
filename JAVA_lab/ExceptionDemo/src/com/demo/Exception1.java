package com.demo;

import java.util.InputMismatchException;

public class Exception1 {

	public static void main(String[] args) {
		try {   
			        
			            int a=30;
			            int b=0;
			            int ans=divide(a,b);
			            System.out.println("Ans: "+ans);
						int[] arr= {3,4,5,6};
						for(int i=0;i<=arr.length;i++) {
							System.out.print(arr[i]+"\t");
						}
			}catch(ArrayIndexOutOfBoundsException|ArithmeticException|NullPointerException e) {
				System.out.println(e.getMessage());
				System.out.println("in main ");
				//e.printStackTrace();
			}catch(InputMismatchException e){
				System.out.println(e.getMessage());
				System.out.println("in input type ");
			}catch(Exception e){
				System.out.println(e.getMessage());
				System.out.println("error");
			}finally {    
				System.out.println("in finally block");
			}
		System.out.println("resume=");

	}

	private static int divide(int a,int b) {
		try {
				int ans=a/b;
				return ans;
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("In divide exceptn");
			throw e;
		}
		
	}

}