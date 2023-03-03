package databaseTocollection;

import java.sql.Connection;

public class DbToCollectionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con=DBConnection.getConnection();
		EmployeeOperation obj=new EmployeeOperation();
		obj.empdbToArrayList(con);
		obj.displayListData(con);
		
		DepartmentOperation dt=new DepartmentOperation();
		dt.deptdbToArraylist(con);
		dt.displayArraylist(con);

	}

}
