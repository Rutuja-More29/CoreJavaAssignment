package com.basicprogram;

import java.util.Scanner;

public class CompoundInterest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float p, r, ci, time, t = 1, amount = 0;
		System.out.println("Enter principle amount:");
		p = sc.nextFloat();
		System.out.println("Enter Time:");
		time = sc.nextFloat();
		System.out.println("Enter Rate:");
		r = sc.nextFloat();
		r = (1 + r) / 100;
		for (int i = 0; i < time; i++)
			t = t * r;
		amount = p * t;
		System.out.println("Amount:" + amount);
		ci = amount - p;
		System.out.println("Compound interest:" + ci);

	}

}
