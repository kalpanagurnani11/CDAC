package com.demo.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.demo.model.Person;
import com.demo.model.Address;

public class ManyToMany {
	public static void main(String args[])
	{
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		
		Person p=new Person(1,"a","b",null);
		Person p1=new Person(2,"c","d",null);
		Address a=new Address(1,"s","k","l",null);
		Address a1=new Address(2,"l","p","o",null);
		Address a2=new Address(3,"u","l","ol",null);
		
		Set<Address> addrset=new HashSet<>();
		addrset.add(a1);
		addrset.add(a);
		p.setAddr(addrset);
		
	
		Set<Address> addrset1=new HashSet<>();
		addrset.add(a1);
		addrset.add(a2);
		p1.setAddr(addrset1);
		
		Set<Person> perset=new HashSet<>();
		perset.add(p);
		a.setP(perset);
		
		Set<Person> perset1=new HashSet<>();
		perset1.add(p);
		perset1.add(p1);
		a1.setP(perset1);
		
		Set<Person> perset2=new HashSet<>();
		perset2.add(p1);
		
		a2.setP(perset2);
		
		session.persist(p);
		session.persist(p1);
		session.persist(a);
		session.persist(a1);
		session.persist(a2);
		
		tr.commit();
		session.close();
		sf.close();
	}

}
