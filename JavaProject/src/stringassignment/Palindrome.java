package stringassignment;

import java.util.Scanner;

public class Palindrome {
	void palindrome(String str,String rev)
	{
		
		
		for(int i=(str.length()-1);i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		if(rev.equalsIgnoreCase(str))
		{
			System.out.println(str+ "\t is a palindrome");
		}
		else
		{
			System.out.println(str+ "\t is not palindrome");
		}
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str,rev=" ";
		System.out.println("Enter a String:");
		str=sc.next();
		int length=str.length();
	Palindrome p=new Palindrome();
	p.palindrome(str, rev);
		

	}

}
