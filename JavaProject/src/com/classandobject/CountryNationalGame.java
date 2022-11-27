package com.classandobject;

import java.util.Scanner;

public class CountryNationalGame {

	void country(String cname) {
		switch (cname) {
		case "India":
			System.out.println("National game hockey");
			break;
		case "Italy":
			System.out.println("National game football");
			break;
		case "Bangladesh":
			System.out.println("National game kabaddi");
			break;
		case "China":
			System.out.println("National game table tennis");
			break;
		case "United State":
			System.out.println("National game baseball");
			break;
		default:
			System.out.println("Enter valid Country");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String cname;
		System.out.println(" countries are:India, China , Bangladesh ,Italy ,United States");
		System.out.println("Enter Country name:");
		cname = sc.nextLine();
		CountryNationalGame c = new CountryNationalGame();
		c.country(cname);

	}

}
