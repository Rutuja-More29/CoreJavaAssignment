package stringpractice;

import java.util.Scanner;

public class CountVowelConsonant {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=sc.nextLine();
		int vcount=0;
		int Ccount=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a' || s.charAt(i)=='e'|| s.charAt(i)=='i'|| s.charAt(i)=='o'||s.charAt(i)=='u' ||s.charAt(i)=='A'|| s.charAt(i)=='E'|| s.charAt(i)=='O'|| s.charAt(i)=='U')
				vcount++;
			else if(s.charAt(i)>='A'&& s.charAt(i)<='Z'||s.charAt(i)>='a'&&s.charAt(i)<='z')
				Ccount++;
		}
		System.out.println("vowel count:"+vcount);
		System.out.println("consonant count:"+Ccount);
	}

}
