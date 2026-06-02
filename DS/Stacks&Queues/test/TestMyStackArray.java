package com.demo.test;

import com.demo.stacks.MyStackArray;

public class TestMyStackArray {

	public static void main(String[] args) {
		MyStackArray ob=new MyStackArray();
		ob.push(12);
		ob.push(22);
		ob.push(32);
		ob.push(42);
		ob.push(52);
		ob.push(62);
		
		while(!ob.isEmpty()) {
			System.out.println(" data : "+ob.pop());
		}
		

	}

}
