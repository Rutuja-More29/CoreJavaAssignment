package com.string;

import java.util.Arrays;

//anagram use only methods
public class Anagram1 {
	public static void main(String args[]) {
		String s1 = "world";
		String s2 = "dlorw";

		if (s1.length() == s1.length()) {
			char a[] = s1.toCharArray();
			char b[] = s2.toCharArray();
			Arrays.sort(a);              // sort method
			Arrays.sort(b);
			System.out.println(Arrays.toString(a));
			System.out.println(Arrays.toString(b));
			int flag = 1;
			if (Arrays.equals(a, b)) {             // equals method
				System.out.println("anagram");
			} else {
				System.out.println("Not Anagram");
			}

		} else
			System.out.println("Not");

	}
}
