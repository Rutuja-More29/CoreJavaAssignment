package com.classandobject;

import java.util.Scanner;

public class Student {
	int id, marks;
	String name, dept;

	void setData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id:");
		id = sc.nextInt();
		System.out.println("Enter the name:");
		name = sc.next();
		System.out.println("Enter the marks:");
		marks = sc.nextInt();
		System.out.println("Enter the dept:");
		dept = sc.next();
	}

	void display() {
		System.out.println(id + " " + name + " " + marks + " " + dept);
	}

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setData();
		Student s2 = new Student();
		s2.setData();
		Student s3 = new Student();
		s3.setData();
		s1.display();
		s2.display();
		s3.display();
	}

}
