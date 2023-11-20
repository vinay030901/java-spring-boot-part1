package com.client;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.context.HibernateContextApp;
import com.entity.Employee;

public class FetchUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HibernateContextApp.getSession();
		Query query = session.createQuery("from Employee");
		List<Employee> lst = query.list();
		for (Employee e : lst)
			System.out.println(e);
	}

}
