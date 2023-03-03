package com.test;

import java.sql.Connection;

public class DBMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn=DBConnection.getConnection();
		FriendshipOperation f=new FriendshipOperation();
		//f.displayData(conn);
		f.insertData(conn);

	}

}
