package com.basicprogram;

import java.util.Scanner;

public class AreaOfEquilateralTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double side, area;
		System.out.println("Enter side of an equilateral triangle:");
		side = sc.nextInt();
		area = (Math.sqrt(3) / 4) * (side * side);
		System.out.println("Area of equilateral triangle:" + area);

	}

}
