package com.demo;

import java.util.Scanner;

public class Exception3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=26;
		while(true) {
			try {
						System.out.println("guess the num");
						int n=sc.nextInt();
						if(n==num) {
							System.out.println("you found it");
							break;
						}else {
							throw new ArithmeticException(" lost the attempt guess once again");
						}
			}catch(ArithmeticException e) {
				System.out.println(e.getMessage());
			}
		}

	}

}