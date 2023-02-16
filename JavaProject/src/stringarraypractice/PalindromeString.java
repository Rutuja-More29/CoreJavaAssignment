package stringarraypractice;

import java.util.Scanner;

public class PalindromeString {
	void check(String s, String str) {
		for (int i = s.length()-1;i>=0;i--) {
			str = str + s.charAt(i);
		}
		if (str.equals(s)) {
			System.out.print(str + " " + " \t palindrome");
		} else {
			System.out.print(str + " " + "\t not palindrome");
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String s = sc.next();
		String str = "";
		PalindromeString ps = new PalindromeString();
		ps.check(s, str);
	}

}
