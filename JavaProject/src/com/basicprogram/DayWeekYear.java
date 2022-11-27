package com.basicprogram;

import java.util.Scanner;

public class DayWeekYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d, day, week, year;
		System.out.println("Enter no.of days:");
		d = sc.nextInt();
		year = d / 365;
		d = d % 365;
		System.out.println("No.of year:" + year);
		week = d / 7;
		d = d % 7;
		System.out.println("No.of Week:" + week);
		day = d;
		System.out.println("No.of day:" + day);

	}

}
