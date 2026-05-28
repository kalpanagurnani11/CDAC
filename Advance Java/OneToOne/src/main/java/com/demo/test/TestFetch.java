package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Student;

public class TestFetch {
	public static void main(String args[])
	{
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Student s1=session.find(Student.class,12);
		System.out.println(s1.getName()+s1.getAddr().getCity());
		
	}

}
