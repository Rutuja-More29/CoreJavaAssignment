package com.basicprogram;

import java.util.Scanner;

public class PerimeterOfRectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l, b, p;
		System.out.println("Enter lenght of Rectangle:");
		l = sc.nextInt();
		System.out.println("Enter breadth of Rectangle:");
		b = sc.nextInt();
		p = (2 * (l + b));
		System.out.println("Perimeter of Rectangle:" + p);

	}

}
