package com.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class FBUsersOperation {
	Scanner sc=new Scanner(System.in);
	Statement stmt;
	
	void insertData(Connection con) {
		try {
			stmt=con.createStatement();
			int i=stmt.executeUpdate("insert into fbusers values(6661,'riyansh','riyansh@gmail.com','67890453',15)");
			if(i!=0) {
				System.out.println("record inserted");
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	void displayData(Connection con) {
		try {
			stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select*from fbusers");
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString("email")+" "+rs.getString("phoneno")+" "+rs.getInt(5));
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	void updateData(Connection con) {
		System.out.println("Enter id:");
		int id=sc.nextInt();
		System.out.println("Enter what you have update:(email/phone no):");
		String updata=sc.next();
		if(updata.equalsIgnoreCase("email")) {
			System.out.println("Enter email:");
			String email=sc.next();
		try {
			int i=stmt.executeUpdate("update fbusers set email=' "+email+" ' where user_id="+id);
			if(i!=0) {
				System.out.println("record updated");
			}
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
	}
		if(updata.equalsIgnoreCase("phoneno")) {
			System.out.println("Enter phone no:");
			String Phoneno=sc.next();
			try {
				int i=stmt.executeUpdate("update fbusers set phoneno=' "+Phoneno+" ' where user_id="+id);
				if(i!=0) {
					System.out.println("record updated");
				}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
	}
	void deleteData(Connection con) {
		System.out.println("Enter id:");
		int id=sc.nextInt();
		try {
			int i=stmt.executeUpdate("delete from fbusers where user_id="+id);
			if(i!=0) {
				System.out.println("record deleted");
			}
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
	}
	void serachData(Connection con) {
		System.out.println("Enter name:");
		String name=sc.next();
		try {
			stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select*from fbusers where user_name= 'rita' ");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getInt(5));
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	
}
