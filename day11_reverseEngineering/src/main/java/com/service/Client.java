package com.service;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.context.HibernateContextApp;
import com.entity.Emp;


public class Client {

	public static void main(String[] args) {
		Session session = HibernateContextApp.getSession();
		Transaction tx = session.beginTransaction();
		Emp emp = new Emp(1039, "user-9", "xyz");
		session.save(emp);
//		tx.commit();
		System.out.println("User saved.");
	}

}
