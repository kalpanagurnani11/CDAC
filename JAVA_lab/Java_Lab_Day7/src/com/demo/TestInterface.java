package com.demo;

public class TestInterface implements myInterface{

	@Override
	public int m1() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public int m2(int x) {
		// TODO Auto-generated method stub
		return x;
	}
	public static void main(String args[])
	{
		TestInterface t1=new TestInterface();
		System.out.println(t1.m1());
		System.out.println(t1.m2(10));
	}
	

}
