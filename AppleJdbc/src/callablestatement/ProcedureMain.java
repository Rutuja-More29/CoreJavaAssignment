package callablestatement;

import java.sql.Connection;

public class ProcedureMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con=DBConnection.getConnection();
		EmployeeProcedureOperation ep=new EmployeeProcedureOperation();
	//	ep.procedureCall(con);
		ep.procedureCallWithOutput(con);

	}

}
