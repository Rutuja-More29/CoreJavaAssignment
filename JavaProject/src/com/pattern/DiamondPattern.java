package com.pattern;
import java.util.Scanner;
public class DiamondPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter a number:");
		num=sc.nextInt();

		for (int i = 1; i <= num; i++) // for rows
		{
			for (int j = num; j >= i; j--) // for space
			{
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) // for star
			{
				System.out.print(" *");
			}
			System.out.println();
		}
		for (int i = 1; i <= num; i++) // for rows
		{
			for (int j = 1; j <= i; j++) // for space
			{
				System.out.print(" ");
			}
			for (int k = 5; k >= i; k--) // for star
			{
				System.out.print(" *");
			}
			System.out.println();
		}

	}
}
