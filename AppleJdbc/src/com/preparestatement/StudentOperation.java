package com.preparestatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentOperation {
	PreparedStatement stmt;
	Scanner sc=new Scanner(System.in);
	void showTableConnection(Connection con) {
		try {
			stmt=con.prepareStatement("show table");
			ResultSet rs=stmt.executeQuery();
			
			System.out.println("\n table in the database are:");
			while(rs.next()) {
				System.out.println(rs.getString(1));
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	void displayStudentData(Connection con) {
		try {
			stmt=con.prepareStatement("select*from student");
			ResultSet rs=stmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	void insertStudentData(Connection con) {
		System.out.println("Enter id,name,email,dept:");
		int id=sc.nextInt();
		String name=sc.next();
		String email=sc.next();
		String dept=sc.next();
		try {
			stmt=con.prepareStatement("insert into student values(?,?,?,?)");
			stmt.setInt(1, id);
			stmt.setString(2, name);
			stmt.setString(3, email);
			stmt.setString(4, dept);
			
			int i=stmt.executeUpdate();
			if(i!=0) {
				System.out.println("record inserted");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	void updateStudentData(Connection con)  {
		System.out.println("Enter id:");
		int id=sc.nextInt();
		System.out.println("Enter the new Email:");
		String email=sc.next();
		try {
			stmt=con.prepareStatement("update student set semail=? where sid=?");
			stmt.setString(1, email);
			stmt.setInt(2, id);
			
			int i=stmt.executeUpdate();
			if(i!=0) {
				System.out.println("record updated");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	void deleteStudentData(Connection con) {
		System.out.println("Enter the id:");
		int id=sc.nextInt();
		try {
			stmt=con.prepareStatement("delete from student where sid=?");
			stmt.setInt(1, id);
			
			int i=stmt.executeUpdate();
			if(i!=0) {
				System.out.println("record deleted");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
