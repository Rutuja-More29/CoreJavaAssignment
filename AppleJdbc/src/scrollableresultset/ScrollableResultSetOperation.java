package scrollableresultset;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ScrollableResultSetOperation {
	Statement pstmt;
	ResultSet rs;
	
	void setScrollable(Connection con) {
		try {
			pstmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			rs=pstmt.executeQuery("select*from employeedetail");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	void forwardTraverse(Connection con) {
		try {
			rs.beforeFirst();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getInt(5));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	void backwordTraverse(Connection con) {
		try {
			rs.afterLast();
			while(rs.previous()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getInt(5));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	void firstLastRecord(Connection con) {
		try {
			rs.first();
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getInt(5));
			System.out.println("-----------------------------------------------");
			rs.last();
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getInt(5));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	void updateRecord(int id,int salary) {
		try {
			rs.beforeFirst();
			while(rs.next()) {
				if(rs.getInt(1)==id) {
					rs.updateInt(4, salary);
					rs.updateRow();
					System.out.println("updated row !!!");
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	void deleteRow(int id) {
		try {
			rs.beforeFirst();
			while(rs.next()) {
				if(rs.getInt(1)==id) {
					rs.deleteRow();
					System.out.println("row deleted !!!");
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	void insertRecord() {
		try {
			rs.moveToInsertRow();
			rs.updateInt(1, 667);
			rs.updateString(2, "natasha");
			rs.updateString(3, "natasha@gmail.com");
			rs.updateInt("salary", 90000);
			rs.updateInt(5, 111);
			System.out.println("inserted record !!!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
