package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.beans.HelloWorld;
import com.demo.beans.MyUser;

public class TestSpring {
	public static void main(String args[])
	{
	ApplicationContext ctx=new ClassPathXmlApplicationContext("myspringconfig.xml");
	HelloWorld hw=(HelloWorld) ctx.getBean("hello");
	System.out.println(hw.sayHello());
	
	MyUser m1=(MyUser) ctx.getBean("u1");
	System.out.println(m1);
	}

}
