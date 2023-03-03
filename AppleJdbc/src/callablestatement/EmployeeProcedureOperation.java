package callablestatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

public class EmployeeProcedureOperation {
	
	CallableStatement cstmt;
	Scanner sc=new Scanner(System.in);
	void procedureCall(Connection con) {
		System.out.println("Enter id:");
		int id=sc.nextInt();
		try {
			cstmt=con.prepareCall("{call EmpNameSalInfo(?)}");
			cstmt.setInt(1, id);
			cstmt.execute();
			
			ResultSet rs=cstmt.getResultSet();
			while(rs.next()) {
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getFloat(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	void procedureCallWithOutput(Connection con) {
		System.out.println("Enter id");
		int id=sc.nextInt();
		try {
			cstmt=con.prepareCall("{call Employeeinfo(?,?,?,?)}");
			cstmt.setInt(1, id);
			cstmt.registerOutParameter(2, Types.VARCHAR);
			cstmt.registerOutParameter(3, Types.VARCHAR);
			cstmt.registerOutParameter(4, Types.DECIMAL);
			
			cstmt.execute();
			
			String name=cstmt.getString(2);
			String email=cstmt.getNString(3);
			int sal=cstmt.getInt(4);
			System.out.println(name+" "+sal);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
