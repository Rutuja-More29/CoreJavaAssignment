package com.practice;

public class N3Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5; i++) {

			for (int k = 1; k <= i; k++) {
				System.out.print(k + " ");
			}
			for (int k = (i - 1); k >= 1; k--) {
				System.out.print(k + " ");
			}
			System.out.println();
		}

	}

}
