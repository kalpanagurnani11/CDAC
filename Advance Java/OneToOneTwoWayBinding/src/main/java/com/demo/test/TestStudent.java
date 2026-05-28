package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Address;
import com.demo.model.Student;

public class TestStudent {
	public static void main(String args[])
	{
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Address addr=new Address(12,"a","b","c",null);
		Address addr1=new Address(31,"b","d","e",null);
		Student s=new Student(12,"g","k",addr);
		Student s1=new Student(21,"i","j",addr1);
		addr.setS(s);
		addr1.setS(s1);
	

		session.persist(s1);
		session.persist(s);
		session.persist(addr);
		session.persist(addr1);
		
		

		tr.commit();
		session.close();
		
		Session session1=sf.openSession();
		Transaction tr1=session1.beginTransaction();
//		Student s2=session1.find(Student.class,21);
		Student s2=session1.byId(Student.class).load(12);

		System.out.println(s2);
		
		
		tr1.commit();
		session1.close();
		sf.close();
	
	}

}
