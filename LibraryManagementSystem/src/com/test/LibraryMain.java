package com.test;

import java.util.Scanner;

import com.dao.LabOperation;
import com.dao.Library;

public class LibraryMain {

	public static void main(String[] args) {
		LabOperation l=new LabOperation();
		Scanner sc = new Scanner(System.in);
		String text = " ";
		do {
			System.out.println("press 1 for no.of view book");
			System.out.println("press 2 for issue book");
			System.out.println("press 3 for return book");
			

			System.out.println("Enter choice...");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("view book");
				l.viewBook();
				break;
			case 2:
				System.out.println(" return book");
				l.issueBook();
				break;
			case 3:
				System.out.println("return book");
				l.returnBook();
				break;
			
			
			default:
				System.out.println("Wrong choice..");

			}
			System.out.println("Do you want to continue? y/n");
			text = sc.next();
		} while (text.equalsIgnoreCase("y"));

	}

}
