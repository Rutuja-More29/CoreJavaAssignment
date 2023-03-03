package com.preparestatement;

import java.sql.Connection;

public class AppleTestEmployeesMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con=DBConnection.getConnection("appletestdb");
		EmployeesOperation e=new EmployeesOperation();
		e.displayConnection(con);
		e.displayConnection1(con);
	}

}
