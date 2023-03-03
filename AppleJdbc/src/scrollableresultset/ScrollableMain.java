package scrollableresultset;

import java.sql.Connection;

public class ScrollableMain {

	public static void main(String[] args) {
		Connection con=DBConnection.getConnection();
		ScrollableResultSetOperation sco=new ScrollableResultSetOperation();
		sco.setScrollable(con);
		System.out.println("---------------forward traverse---------------");
		sco.forwardTraverse(con);
		System.out.println("---------------------backward traverse-------------------");
		sco.backwordTraverse(con);
		System.out.println("-------------------firstLastRecord-------------------------");
		sco.firstLastRecord(con);
		System.out.println("---------------update records------------------");
		sco.updateRecord(88,670000 );
		System.out.println("--------------------delete records--------------------");
		sco.deleteRow(104);
		System.out.println("-----------------------insert records--------------------");
		sco.insertRecord();
		
	}

}
