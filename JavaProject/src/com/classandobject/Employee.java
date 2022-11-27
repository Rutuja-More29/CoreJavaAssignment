package com.classandobject;

import java.util.Scanner;

public class Employee {
	int id, salary;
	String name, dept, email;
	long cntact;

	void setData(int i, String n, String d, int sal, long cnt, String e) {
		id = i;
		name = n;
		dept = d;
		salary = sal;
		cntact = cnt;
		email = e;
	}

	void display() {
		System.out.println(id + " " + name + " " + dept + " " + salary + " " + cntact + " " + email);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Employee id:");
		int id = sc.nextInt();
		System.out.println("Enter Employee name:");
		String name = sc.next();
		System.out.println("Enter the Employee dept:");
		String dept = sc.next();
		System.out.println("Enter Employee salary:");
		int salary = sc.nextInt();
		System.out.println("Enter Employee cntact:");
		long cntact = sc.nextLong();
		System.out.println("Enter Employee email:");
		String email = sc.next();

		Employee e1 = new Employee();
		e1.setData(id, name, dept, salary, cntact, email);
		// e1.display();
		System.out.println("Enter the Employee id:");
		id = sc.nextInt();
		System.out.println("Enter Employee name:");
		name = sc.next();
		System.out.println("Enter the Employee dept:");
		dept = sc.next();
		System.out.println("Enter Employee salary:");
		salary = sc.nextInt();
		System.out.println("Enter Employee cntact:");
		cntact = sc.nextLong();
		System.out.println("Enter Employee email:");
		email = sc.next();

		Employee e2 = new Employee();
		e2.setData(id, name, dept, salary, cntact, email);

		System.out.println("Enter the Employee id:");
		id = sc.nextInt();
		System.out.println("Enter Employee name:");
		name = sc.next();
		System.out.println("Enter the Employee dept:");
		dept = sc.next();
		System.out.println("Enter Employee salary:");
		salary = sc.nextInt();
		System.out.println("Enter Employee cntact:");
		cntact = sc.nextLong();
		System.out.println("Enter Employee email:");
		email = sc.next();

		Employee e3 = new Employee();
		e3.setData(id, name, dept, salary, cntact, email);

		System.out.println("Enter the Employee id:");
		id = sc.nextInt();
		System.out.println("Enter Employee name:");
		name = sc.next();
		System.out.println("Enter the Employee dept:");
		dept = sc.next();
		System.out.println("Enter Employee salary:");
		salary = sc.nextInt();
		System.out.println("Enter Employee cntact:");
		cntact = sc.nextLong();
		System.out.println("Enter Employee email:");
		email = sc.next();

		Employee e4 = new Employee();
		e4.setData(id, name, dept, salary, cntact, email);
		System.out.println("Enter the Employee id:");
		id = sc.nextInt();
		System.out.println("Enter Employee name:");
		name = sc.next();
		System.out.println("Enter the Employee dept:");
		dept = sc.next();
		System.out.println("Enter Employee salary:");
		salary = sc.nextInt();
		System.out.println("Enter Employee cntact:");
		cntact = sc.nextLong();
		System.out.println("Enter Employee email:");
		email = sc.next();

		Employee e5 = new Employee();
		e5.setData(id, name, dept, salary, cntact, email);
		e1.display();
		e2.display();
		e3.display();
		e4.display();
		e5.display();
	}

	
}
