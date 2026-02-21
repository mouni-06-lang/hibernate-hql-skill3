package com.hql.loader;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.hql.entity.Product;

public class ProductDataLoader {

    public static void loadSampleData(Session session) {

        Transaction tx = session.beginTransaction();

        session.save(new Product("Laptop", 900.0, 15, "Electronics"));
        session.save(new Product("Mouse", 25.0, 50, "Electronics"));
        session.save(new Product("Keyboard", 45.0, 30, "Electronics"));
        session.save(new Product("Monitor", 300.0, 20, "Electronics"));
        session.save(new Product("Desk Chair", 150.0, 10, "Furniture"));
        session.save(new Product("Notebook", 5.0, 100, "Stationery"));

        tx.commit();

        System.out.println("Sample Data Inserted!");
    }
}