package com.classandobject;

public class Parameter {
	void sum(int b) {
		int sum = 0;
		for (int i = 1; i <= b; i++) {
			if (b % i == 0) {
				sum = sum + i;
			}
		}
		System.out.println("Sum of factor are:" + sum);
	}

	public static void main(String[] args) {

		Parameter s = new Parameter();
		s.sum(15);

	}

}
