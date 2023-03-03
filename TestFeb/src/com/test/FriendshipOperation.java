package com.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/*write jdbc program which select friendship data create hashmap which has friendship status code is key and no of record for 
that status code is value*/
public class FriendshipOperation {
	
	PreparedStatement stmt;
	Scanner sc=new Scanner(System.in);
	void displayData(Connection conn) {
		HashMap<Integer ,Integer>hm=new HashMap<>();
		try {
			stmt=conn.prepareStatement("select statuscode from friendship");
			ResultSet rs=stmt.executeQuery();
			
			while(rs.next()) {
				Integer statuscode=rs.getInt("statuscode");
				int count=hm.getOrDefault(statuscode, 0);
				hm.put(statuscode, count+1);
			}
			System.out.println("friendship status code count:");
			for(Map.Entry<Integer, Integer>ent:hm.entrySet()) {
				System.out.println(ent.getKey()+" : "+ent.getValue());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	/* insert 1 record in fbusers table after that insert record in friendship status eg 5,Enemy.now assume second
	record is going fail in such scenario first insert record fbusers should also be reverted*/
	
	void insertData(Connection conn) {
		int i;
		System.out.println("Enter id,name,email,phoneno,totalpost:");
		int id=sc.nextInt();
		String name=sc.next();
		String email=sc.next();
		String phoneno=sc.nextLine();
		int totalpost=sc.nextInt();
		try {
			stmt=conn.prepareStatement("insert into fbusers(id,name,email,phoneno,totalpost) values(?,?,?,?,?)");
			stmt.setInt(1, id);
			stmt.setString(2, name);
			stmt.setString(3, email);
			stmt.setString(4, phoneno);
			stmt.setInt(5, totalpost);
		 i=stmt.executeUpdate();
		
		
			// insert record into friendship
			PreparedStatement stmt2=conn.prepareStatement("insert into friendshipstatus(statuscode,fstatus) values(?,?)");
			stmt2.setInt(1, 5);
			stmt2.setString(2, "Enemy");
			i=stmt2.executeUpdate();
		if(i!=0) {
			System.out.println("record inserted");
		}
		
			//commit transaction if insert successfully
			conn.commit();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			// rollback if there is exception
			if(conn!=null) {
				try {
					conn.rollback();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
					
				}
			}
		}
	}
	

