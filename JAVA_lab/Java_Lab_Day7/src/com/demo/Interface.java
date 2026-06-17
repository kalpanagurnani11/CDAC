package com.demo;

 interface  myInterface{
	 int m1();
	 int m2(int x);
	 int i=20;
	 
	 default void m3()
	 {
		 m5();
		 System.out.println("in m3");
	 }
	 
	 static void m4()
	 {
		 System.out.println("in m4");
	 }
	 
	 private void m5()
	 {
		 System.out.println("in m5");
	 }

}
