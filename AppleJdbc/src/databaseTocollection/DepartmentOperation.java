package databaseTocollection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DepartmentOperation {
	ArrayList<Department>al=new ArrayList<>();
	PreparedStatement stmt;
	void deptdbToArraylist(Connection con) {
		try {
			stmt=con.prepareStatement("select*from department");
			ResultSet rs=stmt.executeQuery();
			while(rs.next()) {
				int id=rs.getInt(1);
				String dname=rs.getString(2);
				int empCount=rs.getInt(3);
				
				Department d=new Department();
				d.setDid(id);
				d.setDname(dname);
				d.setEmpCount(empCount);
				
				al.add(d);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	void displayArraylist(Connection con) {
		System.out.println("---------------Department info-----------");
		System.out.println(al);
	}
}
