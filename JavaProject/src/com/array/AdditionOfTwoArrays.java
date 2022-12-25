package com.array;

public class AdditionOfTwoArrays {

	public static void main(String[] args) {
		int a[][] = { { 10, 20 }, { 30, 40 } };
		int b[][] = { { 25, 35 }, { 45, 55 } };
		int c[][] = new int[2][2];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				c[i][j] = a[i][j] + b[i][j];
				System.out.print("\t " + c[i][j]);
			}
			System.out.println();
		}
	}

}
