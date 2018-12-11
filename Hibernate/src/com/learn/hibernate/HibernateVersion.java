package com.learn.hibernate;

public class HibernateVersion {

	public static void main(String[] args) {
		//System.out.println(org.hibernate.cfg.Environment.VERSION);
		
		
		System.out.println(org.hibernate.Version.getVersionString());
		/* try {
        String hibernateVersion = org.hibernate.annotations.common.Version.VERSION;
        System.out.println("Hibernate Version: "+ hibernateVersion);
    } catch (Exception e) {
        e.printStackTrace();
    }*/
		

	}

}
