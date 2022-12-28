package com.stringpractice;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String s1 = sc.next();
		String rev = " ";
		for (int i = (s1.length() - 1); i >= 0; i--)
		{
			rev = rev + s1.charAt(i);

		}
		if (s1.equalsIgnoreCase(rev))
		{
			System.out.println(rev + "\t Palindrome");
		} else
		{
			System.out.println(rev + "\t Not Palindrome");
		}
		
	}

}
