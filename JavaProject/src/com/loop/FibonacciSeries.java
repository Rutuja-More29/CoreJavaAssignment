package com.loop;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int f1 = 0, f2 = 1;
		int f3;
		int num;
		System.out.println("Enter num:");
		num = sc.nextInt();
		System.out.println(f1 + "\n" + f2);
		for (f3 = 1; f3 <= num; f3++) {
			f3 = f1 + f2;
			System.out.println(f3);

			f1 = f2;
			f2 = f3;
		}

	}

}
