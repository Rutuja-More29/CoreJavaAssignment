package com.test;

import java.util.Scanner;

import com.dao.StudentOperation;

public class StudentMain {

	public static void main(String[] args) {
		StudentMain s1 = new StudentMain();
		StudentOperation sop = new StudentOperation();
		Scanner sc = new Scanner(System.in);
		String text = " ";
		do {
			System.out.println("press 1 for no.of student data");
			System.out.println("press 2 for insert Student Data");
			System.out.println("press 3 for display Student Data");
			System.out.println("press 4 for update Student Data");
			System.out.println("press 5 for delete Student Data");
			System.out.println("press 6 for search particular student data");

			System.out.println("Enter choice...");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("No.of student");
				sop.studentData();
				break;
			case 2:
				System.out.println("insert student data");
				sop.insertStudentData();
				break;
			case 3:
				System.out.println("display student data");
				sop.displayStudentData();
				break;
			case 4:
				System.out.println("update student data");
				sop.updateStudentData();
				break;
			case 5:
				System.out.println("delete student data");
				sop.deleteData();
				break;

			case 6:
				System.out.println("search particular student");
				sop.searchStudentData();
				break;
			default:
				System.out.println("Wrong choice..");

			}
			System.out.println("Do you want to continue? y/n");
			text = sc.next();
		} while (text.equalsIgnoreCase("y"));

	}

}
