package com.classandobject;

import java.util.Scanner;

public class MethodP {
	int a, b;
	Scanner sc = new Scanner(System.in);

	void input() {
		System.out.println("Enter two numbers:");
		a = sc.nextInt();
		b = sc.nextInt();
	}

	void process() {
		int sum = a + b;
		System.out.println("Sum:" + sum);
		int sub = a - b;
		System.out.println("Sub:" + sub);
		int multiplication = a * b;
		System.out.println("Multiplication:" + multiplication);
		int division = a / b;
		System.out.println("Division:" + division);
	}

	public static void main(String[] args) {
		MethodP s = new MethodP();
		s.input();
		s.process();

	}

}
