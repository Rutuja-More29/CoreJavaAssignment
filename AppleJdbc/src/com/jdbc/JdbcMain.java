package com.jdbc;

import java.sql.Connection;
import java.util.Scanner;

public class JdbcMain {

	public static void main(String[] args) {
		Connection con=DBConnection.getConnection();
		FBUsersOperation fb=new FBUsersOperation();
		Scanner sc=new Scanner(System.in);
		String text=" ";
		do {
			System.out.println("press 1 for insert data");
			System.out.println("press 2 for update data");
			System.out.println("press 3 for delete data");
			System.out.println("press 4 for display data");
			System.out.println("press 5 for search data");
			System.out.println("Enter choice....");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("insert data");
				fb.insertData(con);
				break;
			case 2:
				System.out.println("update data");
				fb.updateData(con);
				break;
			case 3:
				System.out.println("delete data");
				fb.deleteData(con);
				break;
			case 4:
				System.out.println("display data");
				fb.displayData(con);
				break;
			case 5:
				System.out.println("search data");
				fb.serachData(con);
				break;
				default:
					System.out.println("wrong choice...");
			}
			System.out.println("Do you want to continue ? y/n");
			text=sc.next();
		}while(text.equalsIgnoreCase("y"));

	}

}
