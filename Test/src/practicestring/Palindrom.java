package practicestring;

import java.util.Scanner;

public class Palindrom {
	void check(String s) {
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		if(s.equalsIgnoreCase(rev)) {
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=sc.next();
		Palindrom p=new Palindrom();
		p.check(s);
		

	}

}
