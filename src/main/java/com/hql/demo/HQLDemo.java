package com.hql.demo;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hql.entity.Product;
import com.hql.util.HibernateUtil;

public class HQLDemo {

	public static void main(String[] args) {

	    SessionFactory factory = HibernateUtil.getSessionFactory();
	    Session session = factory.openSession();

	    System.out.println("=== Products Between 20 and 200 ===");

	    List<Product> list = session.createQuery(
	            "FROM Product p WHERE p.price BETWEEN :min AND :max",
	            Product.class)
	            .setParameter("min", 20.0)
	            .setParameter("max", 200.0)
	            .list();

	    list.forEach(p -> 
	        System.out.println(p.getName() + " - $" + p.getPrice()));

	    session.close();
	    factory.close();
	}
}