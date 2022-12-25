package com.string;

import java.util.Scanner;

public class Fst {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three String:");
		String s1 = sc.next();
		String s2 = sc.next();
		String s3 = sc.next();
		
		
		for (int i = 0; i < s1.length(); i++) {
			if(i<s1.length()) {
			System.out.print(s1.charAt(i));
			}
			if(i<s2.length()) {
			System.out.print(s2.charAt(i));
			}
			if(i<s3.length()) {
			System.out.print(s3.charAt(i));
			}
			
			System.out.println();

		}

	}

}
