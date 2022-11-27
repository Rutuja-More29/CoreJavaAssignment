package com.basicprogram;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float p, r, t, si;
		System.out.println("Enter principle amount:");
		p = sc.nextFloat();
		System.out.println("Enter time:");
		t = sc.nextFloat();
		System.out.println("Enter Rate:");
		r = sc.nextFloat();
		si = (p * t * r) / 100;
		System.out.println("si:" + si);

	}

}
