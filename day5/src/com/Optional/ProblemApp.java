package com.Optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProblemApp {

	public static List<Employee> createEmployee() {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("Vinay", "Dehradun", 22));
		empList.add(new Employee("Abhay", "London", 18));
		empList.add(new Employee("Bromo", "delhi", 28));
		return empList;
	}

	public static Optional<Employee> searchEMployee(List<Employee> empList, String name) {
		for (Employee em : empList)
			if (em.getName().equalsIgnoreCase(name))
				return Optional.of(em);
		return Optional.empty();
	}

	public static void main(String[] args) {
		List<Employee> empList = createEmployee();
		Optional<Employee> emp = searchEMployee(empList, "abhay1");
		if (emp.isPresent()) {
			Employee employee = emp.get();
			System.out.println("Employee: " + employee.getName());
		}
		else
			System.out.println("User couldn't be found");

	}
}
