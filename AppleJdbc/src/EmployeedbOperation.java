import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class EmployeedbOperation {
	Statement stmt;
	Scanner sc=new Scanner(System.in);
	void displayData(Connection con) {
		//create Statement /   preparedStatement/  callableStatement
		//	static              user values         function/procedure
		try {
			 stmt=con.createStatement();
			// executeQuery        /executeUpdate       /execute
			// select               insert/update/delete  diff executeQuery and executeUpdate
			
			// ResultSet= stored data in table format
			ResultSet rs=stmt.executeQuery("select*from employeedetail");
			System.out.println(" eid      ename        email         salary       did \n");
			while(rs.next()) {
				// getInt(colIndex/colLabel)/getString(colIndex /colLabel) in sql
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t "+rs.getString("email")+"\t "+rs.getInt("salary")+"\t "+rs.getString(5));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	void insertData(Connection con) {
		try {
			stmt=con.createStatement();
			//return int value
			int i=stmt.executeUpdate("insert into employeedetail values(50,'namish','namish@gmail.com',55000,222)");
			if(i!=0) {
				System.out.println("record inserted");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	void updateData(Connection con) {
		System.out.println("Enter the id:");
		int id=sc.nextInt();
		System.out.println("Enter what you have to update: (email/salary): ");
		String udata=sc.next();
		if(udata.equalsIgnoreCase("email")) {
			System.out.println("Enter the email:");
			String email=sc.next();
			try {
				int i=stmt.executeUpdate("update employeedetail set email=' "+email+"' where eid="+id);
				if(i!=0) {
					System.out.println("record updated");
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		if(udata.equalsIgnoreCase("salary")) {
			System.out.println("Enter the salary:");
			int salary=sc.nextInt();
			try {
				int i=stmt.executeUpdate("update employeedetail set salary=' "+salary+" ' where eid="+id);
				if(i!=0) {
					System.out.println("record update");
				}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
	}
	void deleteData(Connection con) {
		System.out.println("Enter id");
		int id=sc.nextInt();
		try {
			int i=stmt.executeUpdate("delete from employeedetail where eid="+id);
			if(i!=0) {
				System.out.println("record deleted");
			}
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
	}
}
