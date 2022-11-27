package com.loop;

import java.util.Scanner;

public class GcdLcm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2, gcd, lcm, remainder, numerator, denominator;
		System.out.println("Enter two number:");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		if (n1 > n2) {
			numerator = n1;
			denominator = n2;
		} else {
			numerator = n2;
			denominator = n1;
		}
		remainder = numerator % denominator;
		while (remainder != 0) {
			numerator = denominator;
			denominator = remainder;
			remainder = numerator % denominator;
		}
		gcd = denominator;
		lcm = n1 * n2 / gcd;
		System.out.println("gcd of " + n1 + "and " + n2 + "=" + gcd);
		System.out.println("lcm of " + n1 + " and " + n2 + " =" + lcm);

	}

}
