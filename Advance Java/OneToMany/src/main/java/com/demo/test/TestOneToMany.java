package com.demo.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.demo.model.Person;
import com.demo.model.Address09;

public class TestOneToMany {
	public static void main(String args[])
	{
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Set<Address09> addrset=new HashSet<>();
		Person p=new Person(1,"a","b",null);
		Person p1=new Person(2,"c","d",null);
		Address09 a=new Address09(1,"s","k","l",p);
		Address09 a1=new Address09(2,"l","p","o",p);
		addrset.add(a1);
		addrset.add(a);
		p.setAddr(addrset);
		Address09 a2=new Address09(3,"u","l","ol",p1);
		Address09 a3=new Address09(4,"o","t","o",p1);
		Set<Address09> addrset1=new HashSet<>();
		addrset.add(a3);
		addrset.add(a2);
		p1.setAddr(addrset1);
		session.persist(p);
		session.persist(p1);
		session.persist(a);
		session.persist(a1);
		session.persist(a2);
		session.persist(a3);
		tr.commit();
		session.close();
		sf.close();
	}

}
