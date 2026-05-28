package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Address;

public class TestFetch {
	public static void main(String args[])
	{
	SessionFactory sf=new Configuration().configure().buildSessionFactory();
	Session session=sf.openSession();
	Transaction tr=session.beginTransaction();
	Address a=session.find(Address.class, 77);
	System.out.println(a.getState());
	System.out.println(a.getS());
	
	}

}
