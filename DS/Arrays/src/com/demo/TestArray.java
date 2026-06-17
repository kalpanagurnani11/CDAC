package com.demo;

import java.util.stream.IntStream;

public class TestArray {
	public static void main(String args[])
	{
		ArrayService ars=new ArrayService();
		ars.add(12);
		ars.add(1);
		System.out.println(ars);
		ars.deleteByPos(0);
		System.out.println(ars);
		ars.add(8);
		ars.add(6,2);
		ars.add(5);
		System.out.println(ars);
		ars.deleteByPos(0);
		System.out.println(ars);
		ars.add(9,2);
		int[] arr1=ars.rotateArray(true, 3);
		IntStream.of(arr1).forEach(System.out::println);
		System.out.println(ars);
		int[] arr2=ars.reverseArray(true);
		IntStream.of(arr2).forEach(System.out::println);
		int[] arr=ars.exchangeIndexValue();
		IntStream.of(arr).forEach(System.out::println);
		
		
	}
	

}
