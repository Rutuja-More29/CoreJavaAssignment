package com.loop;

import java.util.Scanner;

public class EvenN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, sum = 0,r = 0;
		System.out.println("Enter a number:");
		n = sc.nextInt();
		for (int i = 2; i <= n; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
		}
			System.out.println("Sum of even number between 1 to"+n+" is:" + sum);
		
	}

}
