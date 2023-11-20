package app1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class EmployeeDAOImpl implements EmployeeDAO {

	@Override
	public void addEmployee(Employee employee) throws SomethingWrongHappen {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fos = new FileOutputStream("E:\\data.txt");
		} catch (FileNotFoundException e) {
			throw new SomethingWrongHappen("Oops, it won't run", e);
		}

	}

}
