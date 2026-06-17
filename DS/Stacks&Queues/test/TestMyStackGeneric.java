package com.demo.test;

import com.demo.stacks.MyStackGeneric;

public class TestMyStackGeneric {

	public static void main(String[] args) {
		MyStackGeneric<String> stk=new MyStackGeneric<>();
		stk.push("hello");
		stk.push("Welcome");
		stk.push("test");
		stk.push("happy");
		while(!stk.isEmpty()) {
			System.out.println(" data : "+stk.pop());
		}
		
		MyStackGeneric<Integer> stkint=new MyStackGeneric<>();
		stkint.push(24);
		stkint.push(34);
		stkint.push(44);
		stkint.push(55);
		while(!stkint.isEmpty()) {
			System.out.println(" data : "+stkint.pop());
		}

	}

}
