package practicestring;

import java.util.Scanner;

public class AlphaDigitSplChar {
	void check(int alpha,int digit,int splchar,String s) {
		
		for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		if(ch>='A' && ch<='Z' || ch>='a'&& ch<='z') {
			alpha++;
		}
		else if(ch>='0' && ch<='9') {
			digit++;
		}
		else {
			splchar++;
		}
		}
		System.out.println("Alphabet:"+alpha);
		System.out.println("Digit:"+digit);
		System.out.println("SplCharacter"+splchar);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=sc.next();
		//int alpha,digit,splchar;
	  int	alpha=0,digit=0,splchar=0;
	  AlphaDigitSplChar ads=new AlphaDigitSplChar();
	  ads.check(alpha, digit, splchar, s);
	  

	}

}
