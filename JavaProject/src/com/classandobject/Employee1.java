package com.classandobject;

import java.util.Scanner;

public class Employee1 {
	int eid, salary;
	String ename, email, dept;
	long cntact;

	void employeeData(int i, String en, String d, int sal, long cn, String e) {
		eid = i;
		ename = en;
		dept = d;
		salary = sal;
		cntact = cn;
		email = e;
	}

	void display() {
		System.out.println(eid + " " + ename + " " + dept + " " + salary + " " + cntact + " " + email);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of employee:");
		int num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			System.out.println("Enter Employee id:");
			int eid = sc.nextInt();
			System.out.println("Enter Employee name:");
			String ename = sc.next();
			System.out.println("Enter Employee dept:");
			String dept = sc.next();
			System.out.println("Enter Employee salary:");
			int sal = sc.nextInt();
			System.out.println("Enter Employee cntact:");
			long cn = sc.nextLong();
			System.out.println("Enter Employee email:");
			String e = sc.next();
			Employee1 e1 = new Employee1();
			e1.employeeData(eid, ename, dept, sal, cn, e);
			e1.display();
		}
	}

}
