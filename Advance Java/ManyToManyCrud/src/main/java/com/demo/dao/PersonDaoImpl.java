package com.demo.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.demo.model.Person;


	
	public class PersonDaoImpl implements PersonDao{
		private SessionFactory sf;
		{
			sf=HibernateUtil.getMySessionFactory();
		}

	@Override
	public boolean savePerson(Person p) {
		// TODO Auto-generated method stub
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		session.persist(p);
		tr.commit();
		session.close();
				
		return true;
	}

	@Override
	public Person findPerson(int pid) {
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Person p=session.find(Person.class,pid);
//		System.out.println(p.getPname());
		tr.commit();
		session.close();
		return p;
	}

	@Override
	public boolean updatePerson(int pid) {
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Person p=session.find(Person.class,pid);
		
		
		return false;
	}

}
