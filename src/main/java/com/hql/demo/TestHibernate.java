package com.hql.demo;
import com.hql.loader.ProductDataLoader;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.hql.entity.Product;
import com.hql.util.HibernateUtil;

public class TestHibernate {

    public static void main(String[] args) {
    	SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();

        ProductDataLoader.loadSampleData(session);

        session.close();
        factory.close();
    }
        
}