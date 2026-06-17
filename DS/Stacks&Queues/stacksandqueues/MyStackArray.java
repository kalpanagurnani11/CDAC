package com.demo.stacks;

public class MyStackArray {
	private int[] arr;
	private int top;
	public MyStackArray() {
		this.arr = new int[5];
		this.top = -1;
	}
	public MyStackArray(int size) {
		this.arr = new int[size];
		this.top = -1;
	}
	
	public boolean isEmpty() {
		return top==-1;
	}
	
	public boolean isFull() {
		return top==arr.length-1;
	}
	
	public void push(int n) {
		if(!isFull()) {
			top++;
			arr[top]=n;
			System.out.println("pushed : "+arr[top]);
		}else {
			System.out.println("stack is full");
		}
	}
	
	public int pop() {
		if(!isEmpty()) {
			int n=arr[top];
			top--;
			System.out.println("poped : "+n);
			return n;
		}else {
			System.out.println("stack is empty");
			return -1;
		}
	}

}
