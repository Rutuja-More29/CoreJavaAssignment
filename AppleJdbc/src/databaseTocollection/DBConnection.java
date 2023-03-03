package databaseTocollection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	static String driver="com.mysql.cj.jdbc.Driver";
	static String url="jdbc:mysql://localhost:3306/employeedb";
	static String username="root";
	static String password="vrishali";
	static Connection getConnection() {
		Connection con=null;
		try {
			Class.forName(driver);
			System.out.println("driver loaded");
			
			 con=DriverManager.getConnection(url, username, password);
			
			System.out.println("Connection established");
		
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
}
