package writtenassignment;

import java.sql.Connection;
import java.util.Scanner;

public class JdbcMain {

	public static void main(String[] args) {
	Connection conn= DBConnection.getConnection();
	DBOperation d=new DBOperation();
	
	Scanner sc=new Scanner(System.in);
	String text=" ";
	do {
		
		
		System.out.println("press 1 for insert data");
		System.out.println("press 2 for update data");
		System.out.println("press 3 for delete data");
		System.out.println("press 4 for display data");
		
		System.out.println("Enter choice....");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("insert data");
			d.insertData(conn);
			break;
		case 2:
			System.out.println("update data");
			d.updateData(conn);
			break;
		case 3:
			System.out.println("delete data");
			d.deleteData(conn);
			break;
		case 4:
			System.out.println("display data");
			d.displayData(conn);
			break;
		
			default:
				System.out.println("wrong choice...");
		}
		System.out.println("Do you want to continue ? y/n");
		text=sc.next();
	}while(text.equalsIgnoreCase("y"));

	}
	
	

}
