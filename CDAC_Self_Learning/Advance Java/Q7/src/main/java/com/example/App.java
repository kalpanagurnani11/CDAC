package com.example;

import com.example.model.Product;
import com.example.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 999.99);
        Product p2 = new Product("Smartphone", 499.99);

        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(p1);
            session.save(p2);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            List<Product> products = session.createQuery("from Product", Product.class).list();
            for (Product p : products) {
                System.out.println("Product: " + p.getName() + " - $" + p.getPrice());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            Product loaded = session.get(Product.class, 1L);
            if (loaded != null) {
                loaded.setPrice(899.99);
                session.update(loaded);
            }
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Product loaded = session.get(Product.class, 1L);
            if (loaded != null) {
                System.out.println("Updated Price of Product 1: " + loaded.getPrice());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            Product loaded = session.get(Product.class, 2L);
            if (loaded != null) {
                session.delete(loaded);
            }
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            List<Product> products = session.createQuery("from Product", Product.class).list();
            System.out.println("Total products remaining: " + products.size());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
