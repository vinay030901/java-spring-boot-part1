package app1;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee(101, "vinay");
		EmployeeDAO e = new EmployeeDAOImpl();
		try {
			e.addEmployee(emp);
		} catch (SomethingWrongHappen e1) {
			// TODO Auto-generated catch block
			System.out.println(e1.getMessage());
		}
		System.out.println("Employee added");
	}

}