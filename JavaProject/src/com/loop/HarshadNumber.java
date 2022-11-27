package com.loop;

import java.util.Scanner;

public class HarshadNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num;
		int rem = 0, sum = 0, temp;
		System.out.println("Enter a number:");
		num = sc.nextInt();
		temp = num;
		while (num > 0) {
			rem = num % 10;
			sum = sum + rem;
			num = num / 10;
		}
		if (temp % sum == 0) {
			System.out.println(temp + "is a harshad number");
		} else {
			System.out.println(temp + " is not harshad number");
		}
	}

}
