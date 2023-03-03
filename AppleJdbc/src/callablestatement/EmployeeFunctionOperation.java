package callablestatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

public class EmployeeFunctionOperation {
	CallableStatement cstmt;
	Scanner sc=new Scanner(System.in);
	void functionCall(Connection con) {
		int num=5;
		try {
			cstmt=con.prepareCall("{?= call factorial(?)}");
			cstmt.setInt(2, num);
			cstmt.registerOutParameter(1, Types.INTEGER);
			cstmt.execute();
			System.out.println("factoral:"+cstmt.getInt(1));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	void functioncallDate(Connection con) {
		System.out.println("Enter date:");
		String date=sc.next();
		try {
			cstmt=con.prepareCall("{? = call ProbationEndDate(?)}");
			cstmt.setString(2, date);
			cstmt.registerOutParameter(1, Types.DATE);
			cstmt.execute();
			
			System.out.println("probation end date:"+cstmt.getDate(1));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
