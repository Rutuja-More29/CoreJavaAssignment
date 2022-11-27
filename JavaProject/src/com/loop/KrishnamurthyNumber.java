package com.loop;

import java.util.Scanner;

public class KrishnamurthyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, a = 0, sum = 0;
		System.out.println("Enter a number:");
		num = sc.nextInt();
		int temp = num;
		String s = Integer.toString(num);
		int l = s.length();
		while (temp > 0) {
			a = temp % 10;
			sum = sum + (int) Math.pow(a, l);
			l--;
			temp = temp / 10;

		}
		if (sum == num)
			System.out.println("kirshnamurthy number" + num);

		else
			System.out.println("not krishnamurthy number:" + num);

	}

}
