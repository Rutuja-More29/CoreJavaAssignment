package com.assignment;

import java.util.Scanner;

public class Student {
	int sub1, sub2, sub3, sub4, sub5;

	void setData(int s1, int s2, int s3, int s4, int s5) {
		sub1 = s1;
		sub2 = s2;
		sub3 = s3;
		sub4 = s4;
		sub5 = s5;
	}

	void calculate() {
		int totalmarks = sub1 + sub2 + sub3 + sub4 + sub5;
		int percentage = totalmarks / 5;
		// System.out.println(percentage);
		if (percentage >= 80)
			System.out.println("First class");
		else
			System.out.println("Second class");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks of sub1,sub2,sub3,sub4,sub5:");
		int s1 = sc.nextInt();
		int s2 = sc.nextInt();
		int s3 = sc.nextInt();
		int s4 = sc.nextInt();
		int s5 = sc.nextInt();

		Student s = new Student();
		s.setData(s1, s2, s3, s4, s5);
		s.calculate();

	}

}
