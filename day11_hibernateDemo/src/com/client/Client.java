package com.client;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.context.HibernateContextApp;
import com.entity.Employee;

public class Client {

	public static void main(String[] args) {
		Session session = HibernateContextApp.getSession();
		Transaction tx = session.beginTransaction();
		Employee emp = new Employee(1036, "user-6", "xyz");
		session.save(emp);
		tx.commit();
		Employee em = (Employee) session.get(Employee.class, 12);
		System.out.println(em);
	}

}
