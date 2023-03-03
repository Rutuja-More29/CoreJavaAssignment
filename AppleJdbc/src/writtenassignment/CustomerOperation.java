package writtenassignment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class CustomerOperation {
	PreparedStatement stmt;
	Scanner sc=new Scanner(System.in);
	void displayData(Connection conn) {
		try {
			stmt = conn.prepareStatement("select*from customer");
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4)
				+ " " + rs.getString(5) + " " + rs.getString(6));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	void insertData(Connection conn) {
		System.out.println("Enter id,first_name,last_name,mobile no,gender,email");
		int id=sc.nextInt();
		String first_name=sc.next();
		String last_name=sc.next();
		String mobileno=sc.nextLine();
		String gender=sc.next();
		String email=sc.nextLine();
		try {
			stmt=conn.prepareStatement("insert into customer(?,?,?,?,?,?)");
			stmt.setInt(1, id);
			stmt.setString(2, first_name);
			stmt.setString(3, last_name);
			stmt.setString(4, mobileno);
			stmt.setString(5, gender);
			stmt.setString(6, email);
			int i=stmt.executeUpdate();
			if(i!=0) {
				System.out.println("record inserted");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	void updateData(Connection conn) {
		System.out.println("Enter id:");
		int id=sc.nextInt();
		System.out.println("Enter mobileno:");
		String mobileno=sc.nextLine();
		try {
			stmt=conn.prepareStatement("update customer set mobile_no=? where cust_id=?");
			stmt.setString(1, mobileno);
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
	void deleteData(Connection conn) {
		System.out.println("Enter id");
		int id=sc.nextInt();
		try {
			stmt=conn.prepareStatement("delete from customer where cust_id=?");
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
