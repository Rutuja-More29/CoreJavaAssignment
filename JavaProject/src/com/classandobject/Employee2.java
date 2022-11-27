package com.classandobject;

import java.util.*;

public class Employee2 {
	int id;
	String name, dept;
	float bonus, pf;
	float salary;

	
	public void setData(int i, String n, String d, float salary2) {
		id = i;
		name = n;
		salary = salary2;
		dept = d;

	}

	float bonus(int salary, char ch) {
		float newSal;
		System.out.println("Original Salary:" + salary);
		if (ch == 'A')
			newSal = salary + (salary * 0.15f);
		else if (ch == 'B')
			newSal = salary + (salary * 0.10f);
		else if (ch == 'C')
			newSal = salary + (salary * 0.05f);
		else
			newSal = salary;
		System.out.println("Salary after adding bonus:" + newSal);
		return newSal;

	}

	void pfCalculator(float salary) {
		float pf = salary * 0.10f;
		System.out.println("Employee pf:" + pf);
	
	}

	void display() {
		System.out.println(name + " " + salary + " " + bonus+ " " + pf);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = 0;
		System.out.println("Enter Employee id:");
		int i = sc.nextInt();
		System.out.println("Enter Employee name:");
		String n = sc.next();
		// System.out.println("Enter Employee salary:");
		// int sal=sc.nextInt();
		System.out.println("Enter Employee dept:");
		String d = sc.next();
		System.out.println("Enter salary and (A/B/C) rating:");
		int salary = sc.nextInt();
		Employee2 e = new Employee2();
		e.setData(i, n, d, salary);
		float newSal = e.bonus(salary, ch);
		e.pfCalculator(newSal);
		e.display();

	}

}
