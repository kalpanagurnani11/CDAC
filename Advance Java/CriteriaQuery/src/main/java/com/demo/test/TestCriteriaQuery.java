package com.demo.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Product;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;


public class TestCriteriaQuery {
	public static void main(String args[])
	{
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		
		CriteriaBuilder cb=session.getCriteriaBuilder();
		CriteriaQuery <Product> cq= cb.createQuery(Product.class);
		Root<Product> root=cq.from(Product.class);
		
		cq.select(root);
		List<Product>plist=session.createQuery(cq.getResultList())
		
		
	}

}
