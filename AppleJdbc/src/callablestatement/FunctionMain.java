package callablestatement;

import java.sql.Connection;

public class FunctionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con=DBConnection.getConnection();
		EmployeeFunctionOperation f=new EmployeeFunctionOperation();
		//f.functionCall(con);
		f.functioncallDate(con);
	}

}
