package com.basicprogram;

import java.util.Scanner;

public class Temperture {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float c, f;
		System.out.println("Enter temperture in Fahernheit:");
		f = sc.nextFloat();
		c = ((f - 32) * 5) / 9;
		System.out.println("Temperture in celsius:" + c);

	}

}
