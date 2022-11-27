package com.basicprogram;

import java.util.Scanner;

public class CmtoMeterAndKilometer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double cm, m, km, meter = 0.01, kilometer = 0.00001;
		System.out.println("Enter lenght in cm:");
		cm = sc.nextInt();
		m = cm * meter;
		System.out.println("Meter:" + m);
		km = cm * kilometer;
		System.out.println("Kilometer:" + km);

	}

}
