package com.day2;

public class StringFunction {
	public static void main(String[] args)
	{
		String s1="this is a strinbg func";
		System.out.println("len:"+s1.length());
		System.out.println("substring:"+s1.substring(2,6));
		System.out.println("substring:"+s1.substring(2));
		System.out.println("charAt:"+s1.charAt(2));
		System.out.println("lowercase:"+s1.toLowerCase());
		System.out.println("upperCase:"+s1.toUpperCase());
		System.out.println("split:"+s1.split(" ").length);
		System.out.println("join:"+String.join(":",s1,"vvvv","eeee"));
		
		System.out.println("equals:"+s1.equals("helo"));
		System.out.println("comapreTo:"+s1.compareTo("this is a strinbg func"));







	}

}
