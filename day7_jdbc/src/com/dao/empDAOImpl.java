package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.connection.ConnectionDAL;
import com.model.Employee;

public class empDAOImpl implements empDAO {

	static PreparedStatement stmt;
	static String insertData = "insert into employee values(?,?,?)";
	static String selectAll = "select * from employee";
	static String selectOne = "select * from employee where empId=?";

	ConnectionDAL dal = new ConnectionDAL();
	Connection conn = dal.getConnection();

	@Override
	public void insertEmp(Employee emp) {
		try {
			// write the statement
			stmt = conn.prepareStatement(insertData);
			stmt.setInt(1, emp.getEmpId());
			stmt.setString(2, emp.getEmpName());
			stmt.setString(3, emp.getEmpCity());

			// execute the statement
			int a = stmt.executeUpdate();
			if (a > 0)
				System.out.println("employee added");
			else
				System.out.println("Something went wrong");

		} catch (SQLException e) {

		}
	}

	@Override
	public List<Optional<Employee>> loadAll() {
		ArrayList<Optional<Employee>> arr = new ArrayList<>();
		try {
			stmt = conn.prepareStatement(selectAll);

			ResultSet rst = stmt.executeQuery();
			while (rst.next()) {
				arr.add(Optional.of(new Employee(rst.getInt(1), rst.getString(2), rst.getString(3))));
			}
		} catch (SQLException e) {

		}
		return arr;
	}

	@Override
	public Optional<Employee> findEmp(int empId) {
		try {
			stmt = conn.prepareStatement(selectAll);
			stmt.setInt(1, empId);
			ResultSet rst = stmt.executeQuery();

			return Optional.of(new Employee(rst.getInt(1), rst.getString(2), rst.getString(3)));
		} catch (SQLException e) {

		}
		return Optional.empty();
	}

}
