package com.preparestatement;

import java.sql.Connection;
import java.util.Scanner;

public class LibraryManagementMain {
	
	public static void main(String[] args) {
		Connection con=DBConnection.getConnection("librarymanagementsystem");
		Scanner sc=new Scanner(System.in);
		StudentOperation s=new StudentOperation();
		BookOperation b=new BookOperation();
		s.showTableConnection(con);
		System.out.println("Enter table name:");
			String table=sc.next();
			String text=" ";
		if(table.equalsIgnoreCase("student")) {
			do {
				System.out.println("press 1 for display data");
				System.out.println("press 2 for insert data");
				System.out.println("press 3 for update data");
				System.out.println("press 4 for delete data");
				System.out.println("Enter choice....");
				int choice=sc.nextInt();
				switch(choice) {
				case 1:
					System.out.println("display data");
					s.displayStudentData(con);
					break;
				case 2:
					System.out.println("insert data");
					s.insertStudentData(con);
					break;
				case 3:
					System.out.println("update data");
					s.updateStudentData(con);
					break;
				case 4:
					System.out.println("delete data");
					s.deleteStudentData(con);
					break;
					default:
						System.out.println("wrong choice");
				}
				System.out.println("do you want to continue?(y/n");
				text=sc.next();
			}while(text.equalsIgnoreCase("y"));
			
		}
		else if(table.equalsIgnoreCase("bookinfo")) {
			do {
				System.out.println("press 1 for display data");
				System.out.println("press 2 for insert data");
				System.out.println("press 3 for update data");
				System.out.println("press 4 for delete data");
				System.out.println("Enter choice....");
				int choice=sc.nextInt();
				switch(choice) {
				case 1:
					System.out.println("display data");
					b.displayBookData(con);
					break;
				case 2:
					System.out.println("insert data");
					b.insertBookData(con);
					break;
				case 3:
					System.out.println("update data");
					b.updateBookData(con);
					break;
				case 4:
					System.out.println("delete data");
					b.deleteBookdata(con);
					break;
					default:
						System.out.println("wrong choice");
				}
				System.out.println("do you want to continue?(y/n");
				text=sc.next();
			}while(text.equalsIgnoreCase("y"));
			
		}
	}

}
