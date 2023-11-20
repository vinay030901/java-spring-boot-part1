package com.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.connection.ConnectionDAL;

public class jdbcApp {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		ConnectionDAL dal=new ConnectionDAL();
		Connection con=dal.getConnection();
		System.out.println("connected");
	}

}