package com.basicprogram;

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float em, fm, dm, cn, eg;
		double total, average, percentage;
		System.out.println("Enter marks of em:");
		em = sc.nextFloat();
		System.out.println("Enter marks of fm:");
		fm = sc.nextFloat();
		System.out.println("Enter marks of dm:");
		dm = sc.nextFloat();
		System.out.println("Enter marks of cn:");
		cn = sc.nextFloat();
		System.out.println("Enter marks of eg:");
		eg = sc.nextFloat();
		total = em + fm + dm + cn + eg;
		System.out.println("Total marks five subject:" + total);
		average = total / 5;
		System.out.println("Average marks of five subject:" + average);
		percentage = (total / 500) * 100;
		System.out.println("Percentage:" + percentage);

	}

}
