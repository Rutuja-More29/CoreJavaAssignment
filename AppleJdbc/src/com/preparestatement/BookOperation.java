package com.preparestatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class BookOperation {
	PreparedStatement stmt;
	Scanner sc=new Scanner(System.in);
	void displayBookData(Connection con) {
		try {
			stmt=con.prepareStatement("select*from bookinfo");
			ResultSet rs=stmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	void insertBookData(Connection con) {
		System.out.println("Enter the id,name,authorname,copies");
		int id=sc.nextInt();
		String name=sc.next();
		String authorname=sc.next();
		int copies=sc.nextInt();
		try {
			stmt=con.prepareStatement("insert into bookinfo values(?,?,?,?)");
			stmt.setInt(1, id);
			stmt.setString(2, name);
			stmt.setString(3, authorname);
			stmt.setInt(4, copies);
			
			int i=stmt.executeUpdate();
			if(i!=0) {
				System.out.println("record inserted");
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	void updateBookData(Connection con) {
		System.out.println("Enter id:");
		int id=sc.nextInt();
		System.out.println("Enter no.of copies:");
		int copies=sc.nextInt();
		try {
			stmt=con.prepareStatement("update bookinfo set copies=? where bid=?");
			stmt.setInt(1, copies);
			stmt.setInt(2, id);
			
			int i=stmt.executeUpdate();
			if(i!=0) {
				System.out.println("record updated");
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	void deleteBookdata(Connection con) {
		System.out.println("Enter id:");
		int id=sc.nextInt();
		try {
			stmt=con.prepareStatement("delete from bookinfo where bid=?");
			stmt.setInt(1, id);
			int i=stmt.executeUpdate();
			while(i!=0) {
				System.out.println("record deleted");
			}
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
	}
}
