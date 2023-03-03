import java.sql.Connection;

public class JdbcMain {

	public static void main(String[] args) {
		
		 Connection con=DBConnection.getConnection();
		 EmployeedbOperation obj=new EmployeedbOperation();
		// obj.insertData(con);
		 obj.displayData(con);
		// obj.updateData(con);
		 obj.deleteData(con);
		 obj.displayData(con);
		 

	}

}
