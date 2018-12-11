package com.vijay.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.vijay.pojo.UserDetails;

public class HibernateTest {

	public static void main(String[] args) {
		UserDetails obj = new UserDetails();
		//obj.setUserId(100);
		obj.setUserName("rakesh");
		UserDetails obj2 = new UserDetails();
		obj2.setUserName("vijay");
		SessionFactory sessionFactory = new Configuration().configure("/test.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(obj);
		session.save(obj2);
		session.getTransaction().commit();
	}
}
