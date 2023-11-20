package com.main;

import java.util.List;
import java.util.Optional;

import com.dao.empDAO;
import com.dao.empDAOImpl;
import com.model.Employee;

public class MainApp {

	public static void main(String[] args) {

		empDAO dao = new empDAOImpl();
		Employee emp = new Employee(103, "abhay", "chandigrah");
//		dao.insertEmp(emp);
//		List<Optional<Employee>> empList = dao.loadAll();
//		empList.stream().forEach(i -> System.out.println(i));
	}

}
