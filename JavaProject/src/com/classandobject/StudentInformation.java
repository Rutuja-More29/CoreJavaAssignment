package com.classandobject;

import java.util.Scanner;

public class StudentInformation {
	int id;
	String sname;
	int sub1, sub2, sub3;
	int percentage;
	Scanner sc = new Scanner(System.in);

	void accept() {
		System.out.println("Enter Student id:");
		id = sc.nextInt();
		System.out.println("Enter Student name:");
		sname = sc.next();
		System.out.println("Enter Three Subject marks:");
		sub1 = sc.nextInt();
		sub2 = sc.nextInt();
		sub3 = sc.nextInt();
	}

	void calculate() {
		int total = sub1 + sub2 + sub3;
		percentage = total / 3;

	}

	void display() {
		System.out.println("Student Id:" + id);
		System.out.println("Enter Student name:" + sname);
		System.out.println("Enter Physic marks:" + sub1);
		System.out.println("Enter Chemistry marks:" + sub2);
		System.out.println("Enter Math marks:" + sub3);
		System.out.println("Percentage of Three subject are:" + percentage);

	}

	public static void main(String[] args) {
		StudentInformation s = new StudentInformation();
		s.accept();
		s.calculate();
		s.display();

	}

}
