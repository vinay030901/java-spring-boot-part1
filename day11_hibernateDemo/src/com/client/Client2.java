package com.client;

import org.hibernate.Session;

import com.context.HibernateContextApp;
import com.entity.Employee;

public class Client2 {

	public static void main(String[] args) {
		Session session = HibernateContextApp.getSession();
		Employee em1 = (Employee) session.get(Employee.class, 1);
		System.out.println(em1);
		Employee em2 = (Employee) session.get(Employee.class, 1);
		System.out.println(em2);
	}

}
