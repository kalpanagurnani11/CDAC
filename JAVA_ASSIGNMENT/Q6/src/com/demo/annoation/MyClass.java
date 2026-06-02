package com.demo.annoation;
public class MyClass {

    @CustomAnnotation
    public void method1() {
        System.out.println("Method 1");
    }

    public void method2() {
        System.out.println("Method 2");
    }

    @CustomAnnotation
    public void method3() {
        System.out.println("Method 3");
    }

    public void method4() {
        System.out.println("Method 4");
    }
}