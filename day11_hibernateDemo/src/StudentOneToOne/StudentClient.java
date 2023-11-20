package StudentOneToOne;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.context.HibernateContextApp;

public class StudentClient {

	public static void main(String[] args) {
		Session session = HibernateContextApp.getSession();
		Transaction tx = session.beginTransaction();
		Semester sem = new Semester(30, 100);
		Student student = new Student("vinay", sem);
		session.save(student);
		tx.commit();
		System.out.println(student);
	}

}
