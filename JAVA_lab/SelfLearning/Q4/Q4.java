package com.demo;

public class Q4 {
	
	    public static void main(String[] args) {

	       
	        String s = "Hello";
	        s = s + " World";

	       
	        StringBuffer sb = new StringBuffer("Hello");
	        sb.append(" Java");

	       
	        StringBuilder sb2 = new StringBuilder("Hello");
	        sb2.append(" Builder");

	        System.out.println(s);
	        System.out.println(sb);
	        System.out.println(sb2);
	    }
	

}
