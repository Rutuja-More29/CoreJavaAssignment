package com.basicprogram;

import java.util.Scanner;

public class SumOfTwoNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, sum;
		System.out.println("Enter First Number:");
		num1 = sc.nextInt();
		System.out.println("Enter Second Number:");
		num2 = sc.nextInt();
		sum = num1 + num2;
		System.out.println("Sum of two number:" + sum);

	}

}
