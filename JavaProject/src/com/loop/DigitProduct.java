package com.loop;

import java.util.Scanner;

public class DigitProduct {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, product = 1;
		System.out.println("Enter a number:");
		n = sc.nextInt();
		while (n > 0) { //we also use while(n!=0)
			n = n %10;
			product = product * n;
			n = n / 10;
		}
		System.out.println("product of digit in :" + product);

	}

}
