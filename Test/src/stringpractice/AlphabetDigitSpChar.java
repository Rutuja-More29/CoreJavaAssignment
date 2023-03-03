package stringpractice;

import java.util.Scanner;

public class AlphabetDigitSpChar {
	void count(String s,int alpha,int digit,int splchar) {
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='a' &&ch<='z' || ch>='A'&& ch<='Z') {
				alpha++;
			}
			else if(ch>='0'&& ch<='9') {
				
				digit++;
			}
			else
			{
				splchar++;
			}
		}
		System.out.println("alphabet:"+alpha);
		System.out.println("digit:"+digit);
		System.out.println("specialChar:"+splchar);
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string:");
		String s=sc.nextLine();
		int alpha,digit,splchar;
		alpha=digit=splchar=0;
		AlphabetDigitSpChar a=new AlphabetDigitSpChar();
		a.count(s, alpha, digit, splchar);
	}

}
