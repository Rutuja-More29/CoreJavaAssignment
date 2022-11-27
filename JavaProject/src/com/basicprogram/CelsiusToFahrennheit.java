package com.basicprogram;

import java.util.Scanner;

public class CelsiusToFahrennheit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float celsius, fahrenheit;
		System.out.println("Enter temperture in celsius:");
		celsius = sc.nextFloat();
		fahrenheit = ((celsius * 9) / 5) + 32;
		System.out.println("Temperture in fahrenheit:" + fahrenheit);

	}

}
