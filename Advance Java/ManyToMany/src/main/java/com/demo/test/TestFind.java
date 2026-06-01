package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Person;

public class TestFind {
	public static void main(String args[]) {
	SessionFactory sf=new Configuration().configure().buildSessionFactory();
	Session session=sf.openSession();
	Transaction tr=session.beginTransaction();
	
	Person p=session.find(Person.class,1);
	System.out.println(p);
	System.out.println(p.getAddr());
	
	
	
	tr.commit();
	session.close();
	sf.close();
	
	}

}
