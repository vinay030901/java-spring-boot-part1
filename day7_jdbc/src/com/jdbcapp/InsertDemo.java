package com.jdbcapp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.connection.ConnectionDAL;

public class InsertDemo {

	static PreparedStatement stmt;
	static String insertData = "insert into employee values(?,?,?)";

	public static void main(String[] args) {

		// loading the driver
		ConnectionDAL dal = new ConnectionDAL();

		// establishing the statement
		Connection conn = dal.getConnection();

		try {
			// write the statement
			stmt = conn.prepareStatement(insertData);
			stmt.setInt(1, 101);
			stmt.setString(2, "Champ");
			stmt.setString(3, "Dehradun");
			
			// execute the statement
			int a = stmt.executeUpdate();
			if (a > 0)
				System.out.println("employee added");
			else
				System.out.println("Something went wrong");

		} catch (SQLException e) {

		}
	}

}
