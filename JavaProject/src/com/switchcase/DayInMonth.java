package com.switchcase;

import java.util.Scanner;

public class DayInMonth {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month, year;
		System.out.println("Enter month number: ");
		month = sc.nextInt();
		System.out.println("Enter month year:");
		year = sc.nextInt();
		switch (month) {
		case 1:
			System.out.println("January has 31 days");
			break;
		case 2:
			if (year % 4 == 0) {
				System.out.println("Febuary has 29 days");
			} else {
				System.out.println("Febuary has 28 days");
			}
			break;
		case 3:
			System.out.println("March has 31 days");
			break;
		case 4:
			System.out.println("April has 30 days");
			break;
		case 5:
			System.out.println("May has 31 days");
			break;
		case 6:
			System.out.println("June has 30 days");
			break;
		case 7:
			System.out.println("July has 31 days");
			break;
		case 8:
			System.out.println("August has 31 days");
			break;
		case 9:
			System.out.println("September has 30 days");
			break;
		case 10:
			System.out.println("Octomber has 30 days");
			break;
		case 11:
			System.out.println("November has 30 days");
			break;
		case 12:
			System.out.println("December has 31 days");
			break;
		default:
			System.out.println("invalid input");

		}
	}

}
