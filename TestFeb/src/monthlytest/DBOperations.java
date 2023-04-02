package monthlytest;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DBOperations {
		void displayfriendship(Connection conn) {
			ArrayList<friendship>f=new ArrayList<>();
			try {
				Statement stmt=conn.createStatement();
				ResultSet rs=stmt.executeQuery("select*from friendship");
				while(rs.next()) {
					 friendship= new friendship(rs.getInt("statuscode")+" "+rs.getString("fstatus"));
					f.add(friendship);
				}
				 stmt=conn.createStatement();
				 rs=stmt.executeQuery("select*from fbusers");
				 while(rs.next()) {
					 
				 }
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			
		}
}
