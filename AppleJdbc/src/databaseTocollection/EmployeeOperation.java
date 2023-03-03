package databaseTocollection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmployeeOperation {
	ArrayList<Employee>al=new ArrayList<>();
	PreparedStatement stmt;
	void empdbToArrayList(Connection con) {
		try {
			stmt=con.prepareStatement("select*from employeedetail");
			ResultSet rs=stmt.executeQuery();
			while(rs.next()) {
			
				int id=rs.getInt(1);
				String name=rs.getString(2);
				String email=rs.getString(3);
				int sal=rs.getInt(4);
				int did=rs.getInt(5);
				
				Employee e=new Employee();
				e.setId(id);
				e.setName(name);
				e.setEmail(email);
				e.setSalary(sal);
				e.setDeptid(did);
				
				al.add(e);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	void displayListData(Connection con) {
		System.out.println("------------------employee info------------------");
		System.out.println(al);
	}
}
