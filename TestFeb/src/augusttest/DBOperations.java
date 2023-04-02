package augusttest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DBOperations {
	
	void display(Connection conn) {
		Map<String,ArrayList<Integer>>map=new HashMap<>();
		
		try {
			Statement stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery(" select m.model_name,p.purchase_id from  model m,purchase p where m.model_id=p.model_id");
			while(rs.next()) {
				String model_name=rs.getString("model_name");
				int purchase_id=rs.getInt("purchase_id");
				if(map.containsKey(model_name)) {
					map.get(model_name).add(purchase_id);
					
				}
				else {
					ArrayList<Integer>list=new ArrayList<>();
					list.add(purchase_id);
					map.put(model_name, list);
				}
				
			}
			for(Map.Entry<String, ArrayList<Integer>>entry:map.entrySet()) {
				String model_name=entry.getKey();
				ArrayList<Integer>ids=entry.getValue();
				System.out.println(model_name+" :"+ids);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
