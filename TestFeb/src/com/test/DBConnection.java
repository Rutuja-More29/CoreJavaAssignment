package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	static String driver="com.mysql.cj.jdbc.Driver";
	static String url="jdbc.mysql://localhost:3306/fbusersdb";
	static String username="root";
	static String password="vrishali";
	static Connection getConnection() {
		Connection conn=null;
		try {
			Class.forName(driver);
			System.out.println("driver loaded");
			
			conn=DriverManager.getConnection(url, username, password);
			
			System.out.println("Connection Established");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return conn;
	}

}
