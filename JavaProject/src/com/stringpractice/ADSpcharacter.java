package com.stringpractice;

import java.util.Scanner;

public class ADSpcharacter {
	void count(int alpha,int digit,int schar,String s)
	{
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='a'&& ch<='z' ||ch>='A'&& ch<='Z')
			{
				alpha++;
			}
			else if(ch>='0'&& ch<='9')
			{
				digit++;
			}
			else
			{
				schar++;
			}
		}
		System.out.println("Alphabet:"+alpha);
		System.out.println("Digit:"+digit);
		System.out.println("Special character:"+schar);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=sc.next();
		int alpha=0;int digit=0;int schar=0;
		ADSpcharacter a=new ADSpcharacter();
		a.count(alpha, digit, schar, s);
	}

}
