package com.demo;

public class stackarray {
	int arr[]=new int[5];
	int top=-1;
	
	void push(int x)
	{
		arr[++top]=x;
	}
	void pop()
	{
		System.out.println(arr[top--]);
	}
	void peek()
	{
		System.out.println(arr[top]);
	}
	void display()
	{
		for(int i=top;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String args[])
	{
		stackarray sa=new stackarray();
		sa.push(10);
		sa.push(20);
		sa.display();
		sa.pop();
		sa.push(40);
		sa.peek();
	}

	
}
