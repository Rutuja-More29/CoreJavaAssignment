package com.preparestatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	static String driver = "com.mysql.cj.jdbc.Driver";
	static String url = "jdbc:mysql://localhost:3306/";
	static String username = "root";
	static String password = "vrishali";

	static Connection getConnection(String dbname) {
		Connection con = null;
		url = url + dbname;

		try {
			Class.forName(driver);
			System.out.println("driver loaded");

			con = DriverManager.getConnection(url, username, password);

			System.out.println("Connection established");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return con;
	}
}
