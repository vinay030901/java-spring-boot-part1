package com.dao;

import java.util.List;
import java.util.Optional;

import com.model.Employee;

public interface empDAO {

	public void insertEmp(Employee emp);

	public List<Optional<Employee>> loadAll();

	public Optional<Employee> findEmp(int empId);
}
