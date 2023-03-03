package writtenassignment;

import java.sql.Connection;
import java.util.Scanner;

public class PurchaseMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn= DBConnection.getConnection();
		PurchaseOperation p=new PurchaseOperation();
		CustomerOperation c=new CustomerOperation();
		Scanner sc=new Scanner(System.in);
	
		String text=" ";
		do {
			System.out.println("press 11 for purchase table");
			System.out.println("press 22 for customer table");
			System.out.println("Enter choice....");
			int ch=sc.nextInt();
			switch(ch) {
			case 11:
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
						p.insertData(conn);
						break;
					case 2:
						System.out.println("update data");
						p.updateData(conn);
						break;
					case 3:
						System.out.println("delete data");
						p.deleteData(conn);
						break;
					case 4:
						System.out.println("display data");
						p.displayData(conn);
						break;
					
						default:
							System.out.println("wrong choice...");
					}
					System.out.println("Do you want to continue ? y/n");
					text=sc.next();
				}while(text.equalsIgnoreCase("y"));
				break;
			case 22:
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
						c.insertData(conn);
						break;
					case 2:
						System.out.println("update data");
						c.updateData(conn);
						break;
					case 3:
						System.out.println("delete data");
						c.deleteData(conn);
						break;
					case 4:
						System.out.println("display data");
						c.displayData(conn);
						break;
					
						default:
							System.out.println("wrong choice...");
					}
					System.out.println("Do you want to continue ? y/n");
					text=sc.next();
				}while(text.equalsIgnoreCase("y")); 
				break;
				default:
					System.out.println("wrong choice...");
				
			}
			System.out.println("Do you want to continue ? y/n");
			text=sc.next();
		}while(text.equalsIgnoreCase("y"));
	
		
		
		
		
		
		
		
	
		}
		
		
		

	

}
