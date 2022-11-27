package com.basicprogram;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 11, i = 2;
		int mid = num / 2;
		while (i <= mid) {
			if (num % i == 0) {
				break;
			}
			i++;
		}
		if (i > mid) {
			System.out.println("prime");
		} else
			System.out.println("not prime");
	}

}
