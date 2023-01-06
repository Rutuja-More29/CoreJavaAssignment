package com.stringpractice;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {
	void Anagram(String s1, String s2) {
		if (s1.length() == s2.length()) {
			char a[] = s1.toCharArray();
			char b[] = s2.toCharArray();
			Arrays.sort(a);
			Arrays.sort(b);
			int flag = 1;
			for (int i = 0; i < a.length; i++) {

				if (a[i] != b[i]) {
					System.out.println("Not Anagram");
					flag = 0;
					break;
				}

				
				}
			if (flag == 1) {
				System.out.println("Anagram");
			}
		} else {
			System.out.println("not anagram");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String s1 = sc.next();
		String s2 = sc.next();
		AnagramString a = new AnagramString();
		a.Anagram(s1, s2);

	}

}
