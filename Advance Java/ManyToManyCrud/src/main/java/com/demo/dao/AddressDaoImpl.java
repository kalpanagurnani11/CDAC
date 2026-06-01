package com.demo.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.demo.model.Address;

public class AddressDaoImpl implements AddressDao {
	
	private SessionFactory sf;
	{
		sf=HibernateUtil.getMySessionFactory();
	}
	@Override
	public boolean saveAddress(Address a) {
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		session.persist(a);
		tr.commit();
		session.close();
		return true;
	}
	@Override
	public Address findAddress(int aid) {
		// TODO Auto-generated method stub
		
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Address a=session.find(Address.class,aid);
		return a;
	}

}
