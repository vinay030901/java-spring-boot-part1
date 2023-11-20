package com.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.connection.ConnectionDAL;
import com.models.User;

/**
 * Servlet implementation class registration
 */
@WebServlet("/registrationPage")
public class registrationPage extends HttpServlet {

	private static final long serialVersionUID = 1L;
	static PreparedStatement stmt;
	static String insertData = "insert into user values(?,?,?)";
	ConnectionDAL dal = new ConnectionDAL();
	Connection conn = dal.getConnection();

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		User user = new User(request.getParameter("uname"), request.getParameter("email"),
				request.getParameter("password"));
		int a = insertUser(user);
		System.out.println(user);
		if (a > 0) {
			response.getWriter().println("User account created");
		} else {
			response.getWriter().println("Error in creating user.");
		}
	}

	public int insertUser(User user) {
		try {
			stmt = conn.prepareStatement(insertData);
			stmt.setString(1, user.getName());
			stmt.setString(2, user.getEmail());
			stmt.setString(3, user.getPassword());
			int a = stmt.executeUpdate();
			return a;
		} catch (SQLException e) {

		}
		return 0;
	}

}
