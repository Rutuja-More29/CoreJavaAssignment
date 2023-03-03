package writtenassignment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.Scanner;

public class PurchaseOperation {
	PreparedStatement stmt;
	Scanner sc = new Scanner(System.in);

	void displayData(Connection conn) {
		try {
			stmt = conn.prepareStatement("select*from purchase");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getInt(2) + " " + rs.getInt(3) + " " + rs.getInt(4) + " "
						+ rs.getInt(5) + " " + rs.getString(6) + " " + rs.getInt(7));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	void insertData(Connection conn) {
		System.out.println("Enter purchase_id/cust_id/model_id/booking amount/payment_id/purchase_date/rating_id :");
		int purchase_id = sc.nextInt();
		int cust_id = sc.nextInt();
		int model_id = sc.nextInt();
		int booking_amount = sc.nextInt();
		int payment_id = sc.nextInt();
		String purchase_date = sc.next();
		int rating_id = sc.nextInt();
		try {
			stmt = conn.prepareStatement("insert into purchase value(?,?,?,?,?,?,?)");
			stmt.setInt(1, purchase_id);
			stmt.setInt(2, cust_id);
			stmt.setInt(3, model_id);
			stmt.setInt(4, booking_amount);
			stmt.setInt(5, payment_id);
			stmt.setString(6, purchase_date);
			stmt.setInt(7, rating_id);
			int i = stmt.executeUpdate();
			if (i != 0) {
				System.out.println("record inserted");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	void updateData(Connection conn) {
		System.out.println("Enter purchase_id:");
		int purchase_id=sc.nextInt();
		System.out.println("Enter booking_amount:");
		int booking_amount=sc.nextInt();
		try {
			stmt=conn.prepareStatement("update purchase set booking_amount=? where purchase_id=?");
			stmt.setInt(1, booking_amount);
			stmt.setInt(2, purchase_id);
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
		System.out.println("Enter id:");
		int id=sc.nextInt();
		try {
			stmt=conn.prepareStatement("delete from purchase where purchase_id=?");
			stmt.setInt(1, id);
			int i=stmt.executeUpdate();
			if(i!=0) {
				System.out.println("delete record");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}