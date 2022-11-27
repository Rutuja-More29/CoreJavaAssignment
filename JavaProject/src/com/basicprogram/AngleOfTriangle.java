package com.basicprogram;

import java.util.Scanner;

public class AngleOfTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		System.out.println("Enter first angle of triangle:");
		a = sc.nextInt();
		System.out.println("Enter second angle of triangle:");
		b = sc.nextInt();
		c = 180 - (a + b);
		System.out.println("Third angle of triangle:" + c);

	}

}
