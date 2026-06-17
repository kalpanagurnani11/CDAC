

//Accept 3 numbers from command line arguments. If number is prime, then print the table of
//the number. Other wise divide number by 10 and display output
package com.demo;

public class Prime {
	
	public static void main(String args[])
	{
		System.out.println(args.length);

		for(int i = 0; i < 3; i++)
		{
			int n = Integer.parseInt(args[i]);

			boolean isPrime = true;

			if(n <= 1) {
				isPrime = false;
			}
			else {
				for(int j = 2; j < n; j++)
				{
					if(n % j == 0)
					{
						isPrime = false;
						break;
					}
				}
			}

			if(isPrime)
			{
				for(int k = 1; k <= 10; k++)
				{
					System.out.println(n + " * " + k + " = " + (n * k));
				}
			}
			else
			{
				System.out.println(n + " / 10 = " + (n / 10));
			}
		}
	}
}
//Write a program to maintain student information. For each student store studid, name, m1,
//m2 and m3 (marks of 3 subjects ). Accept information for 2 students and display it as
//follows.