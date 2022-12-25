package com.string;

import java.util.Arrays;

public class StringSplitAndReverse {

	public static void main(String[] args) {
		String st = "Java is good programming language";
		String str[] = st.split(" ");
		System.out.println(Arrays.toString(str));
		for (int i = 0; i < str.length; i++) {
			for (int j = str[i].length() - 1; j >= 0; j--) {
				System.out.print(str[i].charAt(j));
			}
			System.out.println();
		}

		
	}

}
