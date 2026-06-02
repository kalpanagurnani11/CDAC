package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.beans.HelloWorld;
import com.demo.beans.MyUser;
import com.demo.beans.Person;
import com.demo.beans.Product;

public class TestSpring {
	public static void main(String args[])
	{
	ApplicationContext ctx=new ClassPathXmlApplicationContext("myspringconfig.xml");
	HelloWorld hw=(HelloWorld) ctx.getBean("hello");
	System.out.println(hw.sayHello());
	
	MyUser m1=(MyUser) ctx.getBean("u1");
	System.out.println(m1);
	
	Product p1=(Product) ctx.getBean("p1");
	System.out.println(p1);
	Product p2=(Product) ctx.getBean("p2");
	System.out.println(p2);
	
	Person per1=(Person) ctx.getBean("per1");
	System.out.println(per1);
	
	((AbstractApplicationContext) ctx).close();
	}

}
