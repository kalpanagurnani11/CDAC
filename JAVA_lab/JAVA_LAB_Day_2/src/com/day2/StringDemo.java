package com.day2;

public class StringDemo {

	public static void main(String[] args) {
		String s1="Helo";
		String s2=s1;
		System.out.println("s1==s2:"+(s2==s1));
		String s3="Helo";
		System.out.println("s3==s2:"+(s2==s3));
		String s4=new String("Helo");
		System.out.println("s4==s2:"+(s2==s4));
		System.out.println("s4.equals(s2):"+(s4.equals(s2)));
		
		s1="welcome";
		System.out.println(s1+" "+s2);
		System.out.println("s1==s2:"+(s1==s2));
		StringBuilder sbld=new StringBuilder("XXXXX");
		StringBuffer sbuff=new StringBuffer("XXXXX");
		sbuff.append("YYYY");
		System.out.println(sbuff);
		




	}

}
