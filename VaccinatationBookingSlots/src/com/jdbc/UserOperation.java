package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class UserOperation {
	PreparedStatement stmt;
	Scanner sc=new Scanner(System.in);
	void displayData(Connection conn) {
		try {
			stmt=conn.prepareStatement("select*from users");
			ResultSet rs=stmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDate(3)+" "+rs.getString(4)+" "+
						           rs.getString(5)+" "+rs.getInt(6)+" "+rs.getString(7)+" "+rs.getInt(8)+" "+rs.getDate(9));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
