package com.loop;

import java.util.Scanner;

public class FrequencyDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, count, digit, temp;
		System.out.println("Enter a number:");
		num = sc.nextInt();
		for (int i = 0; i <= 9; i++) {
			count = 0;
			temp = num;
			while (temp > 0) {
				digit = temp % 10;
				if (digit == i) {
					count++;
				}
				temp = temp / 10;
			}
			if (count > 0) {
				System.out.println(i + "\t" + count);
			}
		}

	}

}
