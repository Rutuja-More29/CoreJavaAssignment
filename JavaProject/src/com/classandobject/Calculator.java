package com.classandobject;

import java.util.Scanner;

public class Calculator {

	void add() {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Addition:" + (a + b));
	}

	void substract() {

		int a, b;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Substraction:" + (a - b));
	}

	void multiply() {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Multiplication:" + (a * b));
	}

	void divide() {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Division:" + (a / b));

	}

	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.add();
		c.substract();
		c.multiply();
		c.divide();
	}
}
