package com.demo.test;

import java.util.Scanner;

import com.demo.stacks.MyStackGeneric;

public class TestStackBalanceParenthesis {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string to check balanced parenthesis");
		String str=sc.next();
		boolean status=checkBalanceParenthesis(str);
		System.out.println(status?"balanced parenthesis":"not balanced parenthesis");

	}

	private static boolean checkBalanceParenthesis(String str) {
		MyStackGeneric<Character> stk=new MyStackGeneric<>();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='(' || ch=='{' || ch=='[') {
				stk.push(ch);
			}else {
				if(stk.isEmpty()) {
					return false;
				}else {
					char ch2=stk.pop();
					switch(ch) {
					case '}'->{
						   if(ch2!='{') {
							   return false;
						   }
					}
					case ')'->{
						 if(ch2!='(') {
							   return false;
						   }
					}
					case ']'->{
						 if(ch2!='[') {
							   return false;
						   }
					}
					}
				}
			}
		} //end of for
		return stk.isEmpty();
	}

}
