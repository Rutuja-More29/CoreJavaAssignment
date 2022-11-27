package com.basicprogram;

import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l, b, area;
		System.out.println("Enter lenght of rectangle:");
		l = sc.nextInt();
		System.out.println("Enter breadth of rectangle:");
		b = sc.nextInt();
		area = l * b;
		System.out.println("Area of rectangle:" + area);

	}

}
