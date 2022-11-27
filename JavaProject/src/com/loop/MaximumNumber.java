package com.loop;

import java.util.Scanner;

public class MaximumNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int no1 = sc.nextInt();
		int no2 = sc.nextInt();
		int no3 = sc.nextInt();
		if (no1 > no2)
			if (no1 > no3)
				System.out.println("no1 is max");
		if (no2 > no1)
			if (no2 > no3)
				System.out.println("no2 is max");
		if (no3 > no1)
			if (no3 > no2)
				System.out.println("no3 is max");

	}

}
