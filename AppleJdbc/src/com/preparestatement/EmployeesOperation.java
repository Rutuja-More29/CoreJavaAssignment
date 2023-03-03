package com.preparestatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class EmployeesOperation {
	PreparedStatement stmt;
	Scanner sc=new Scanner(System.in);
	void displayConnection(Connection con) {
		System.out.println("Enter dept name:");
		String dept=sc.next();
		try {
			stmt=con.prepareStatement("select*from employees where department_id="+
									"(select department_id from departments where department_name=?)");
			stmt.setString(1, dept);
			ResultSet rs=stmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(11));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}
	void displayConnection1(Connection con) {
		System.out.println("Enter dept name:");
		String dept=sc.next();
		try {
			//display employee name,salary,hire date department name
			stmt=con.prepareStatement("select first_name,last_name,hire_date,salary,department_name"+
									"from employees e,departments d where e.department_id=d.department_id and department_name=?");
			stmt.setString(1, dept);
			ResultSet rs=stmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(11));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
