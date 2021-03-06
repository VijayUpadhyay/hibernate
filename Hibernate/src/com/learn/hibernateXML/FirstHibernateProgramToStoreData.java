package com.learn.hibernateXML;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FirstHibernateProgramToStoreData {
	
	public static void main(String[] args) {


		Configuration cfg=new Configuration();  
	    cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file  
	      
	    //creating session factory object  
	    SessionFactory factory=cfg.buildSessionFactory();  
	      
	    //creating session object  
	    Session session=factory.openSession();  
	      
	    //creating transaction object  
	    Transaction transaction=session.beginTransaction();  
		
		FirstHibernateProgramPOJO  objFirstHibernateProgramPOJO = new FirstHibernateProgramPOJO();
		objFirstHibernateProgramPOJO.setEmpID(100);
		objFirstHibernateProgramPOJO.setEmpName("Ram");
		
		session.persist(objFirstHibernateProgramPOJO);

		transaction.commit();
		
		session.close();
		
		System.out.println("Saved Successfully");
	}
}
