package com.string;
import java.util.Scanner;
public class PalindromeString {
	void reverse(String s,String rev)
	{
		
		for(int i=(s.length()-1);i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
			if(rev.equalsIgnoreCase(s))
			{
				System.out.println(rev+ "\t palindrome");
			}
			else
			{
				System.out.println(rev+ "\t not palindrome");
			}
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr String:");
		String s=sc.next();
		String rev="";
		PalindromeString p=new PalindromeString();
		p.reverse(s, rev);

	}

}
