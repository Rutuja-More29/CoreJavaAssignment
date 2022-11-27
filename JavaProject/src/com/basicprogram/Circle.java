package com.basicprogram;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r, dia;
		float circum, area;
		System.out.println("Enter radius of circle:");
		r = sc.nextInt();
		dia = 2 * r;
		System.out.println("Diameter of circle:" + dia);
		circum = 2 * 3.14f * r;
		System.out.println("Circumference of circle:" + circum);
		area = 3.14f * r * r;
		System.out.println("Area of circle:" + area);

	}

}
