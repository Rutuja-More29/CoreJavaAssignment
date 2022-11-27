package com.loop;

public class MinMaxNumber {

	public static void main(String[] args) {
		int num = 34657;
		int max = num % 10;
		int min = num % 10;
		while (num != 0) {
			int r = num % 10;
			if (r < min) {
				min = r;
			}

			if (r > max) {
				max = r;
			}
			num = num / 10;

		}
		System.out.println("minimum digit:" + min);
		System.out.println("maximum digit:" + max);
	}

}
