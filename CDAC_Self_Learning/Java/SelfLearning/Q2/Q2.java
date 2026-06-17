package com.demo;

public class Q2 {
	    public static void main(String[] args) {
	        Integer x = 20;

	        System.out.println("Bin: " + Integer.toBinaryString(x));
	        System.out.println("Max: " + Integer.MAX_VALUE);
	        System.out.println("Min: " + Integer.MIN_VALUE);

	        String s = "123";
	        int num = Integer.parseInt(s);

	        System.out.println("Parsed: " + num);

	        double d = 12.5;
	        Double dObj = Double.valueOf(d);

	        System.out.println("Double Obj: " + dObj);
	    }
	}

