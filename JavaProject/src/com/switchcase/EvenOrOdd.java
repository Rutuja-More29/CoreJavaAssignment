package com.switchcase;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		System.out.println("Enter a number:");
		num = sc.nextInt();
		switch (num % 2) {
		case 0:
			System.out.println(" even number");
			break;
		case 1:
			System.out.println(" odd number");
			break;

		}

	}

}
