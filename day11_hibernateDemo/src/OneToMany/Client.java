package OneToMany;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.context.HibernateContextApp;

public class Client {

	public static void main(String[] args) {
		Session session = HibernateContextApp.getSession();
		Transaction tx = session.beginTransaction();
		Address address1 = new Address("dehradun", 248007);
		Address address2 = new Address("gurgaon", 122002);

		ArrayList<Address> arr = new ArrayList<>();
		arr.add(address1);
		arr.add(address2);
		Laptop laptop = new Laptop("AK31", 30000);

		Employee emp = new Employee("abhay", "delhi", arr, laptop);
		session.save(emp);
		tx.commit();
		System.out.println(emp);
	}

}
