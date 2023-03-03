package writtenassignment;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DBOperation {
	Statement stmt;
	Scanner sc = new Scanner(System.in);

	void displayData(Connection conn) {
		try {
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select*from customer");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4)
						+ " " + rs.getString(5) + " " + rs.getString(6));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	void insertData(Connection conn) {
		try {
			stmt = conn.createStatement();
			int i = stmt.executeUpdate(
					"insert into customer values(777,'nita','roy','45678903','female','nita@gmail.com')");
			if (i != 0) {
				System.out.println("record inserted");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	void updateData(Connection conn) {
		System.out.println("Enter id:");
		int id = sc.nextInt();
		System.out.println("what you have to update:(mobileno/email)");
		String updata = sc.next();
		if (updata.equalsIgnoreCase("mobile_no")) {
			System.out.println("Enter mobile no:");
			String mobile_no = sc.next();
			try {
				int i = stmt.executeUpdate("update customer set mobile_no=' " + mobile_no + "' where cust_id=" + id);
				if (i != 0) {
					System.out.println("mobile_no updated");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (updata.equalsIgnoreCase("email")) {
			System.out.println("Enter email");
			String email = sc.nextLine();
			try {
				int i = stmt.executeUpdate("update customer set email=' " + email + " ' where cust_id=" + id);
				if (i != 0) {
					System.out.println("email updated");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	void deleteData(Connection conn) {
		System.out.println("Enter id");
		int id = sc.nextInt();
		try {
			int i = stmt.executeUpdate("delete from customer where cust_id=" + id);
			if (i != 0) {
				System.out.println(" record deleted");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
