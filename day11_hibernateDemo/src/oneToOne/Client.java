package oneToOne;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.context.HibernateContextApp;

public class Client {

	public static void main(String[] args) {
		Session session = HibernateContextApp.getSession();
		Transaction tx = session.beginTransaction();
		Laptop laptop = new Laptop("AK31", 30000);
		Employee emp = new Employee("abhay", "delhi", laptop);
		session.save(emp);
		tx.commit();
		System.out.println(emp);
	}

}
