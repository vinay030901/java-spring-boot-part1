package com.client;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.context.HibernateContextApp;
import com.entity.Student;

public class StudentClient {

	public static void main(String[] args) {
		Session session = HibernateContextApp.getSession();
		Transaction tx = session.beginTransaction();
		Student student = new Student(1, "vinay", "C");
		session.save(student);
		tx.commit();
		System.out.println("Student saved");
	}

}
