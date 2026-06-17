package com.demo.test;

import java.util.Scanner;

import com.demo.stacks.MyStackGeneric;

public class TestStackAppPalindrom{

	public static void main(String[] args) {
	    MyStackGeneric<Character> stk=new MyStackGeneric<>();
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter String");
	    String str=sc.next();
	    System.out.println("Given string "+str);
	    for(int i=0;i<str.length();i++) {
	    	stk.push(str.charAt(i));
	    }
	    stk.displayData();
	    String str1="";
	    while(!stk.isEmpty()) {
	    	str1+=stk.pop();
	    }
	    if(str.equals(str1)) {
               System.out.println(" String is palindrom "+str);
	    }else {
	    	System.out.println("String is not palindrom "+str1);
	    }
	}

}
