package com.basicprogram;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int b, h, area;
		System.out.println("Enter base  of triangle:");
		b = sc.nextInt();
		System.out.println("Enter height of triangle: ");
		h = sc.nextInt();
		area = (b * h) / 2;
		System.out.println("Area of triangle:" + area);

	}

}
