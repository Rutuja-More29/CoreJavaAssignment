package com.switchcase;

import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch;
		System.out.println("Enter a character:");
		ch = sc.next().charAt(0);
		switch (ch) {
		case 'a':	
		case 'e':	
		case 'i':	
		case 'o':	
		case 'u':
			System.out.println("vowel");
			break;
		default:
			System.out.println("consonant");

		}

	}

}
