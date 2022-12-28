package com.stringpractice;

public class VowelAndConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="have a nice day";
		String str=s.toLowerCase();
		int vowelcount =0;
		int consonantCount=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='o'||str.charAt(i)=='u')
			{
				vowelcount++;
			}
			else if(str.charAt(i)>='a'&& str.charAt(i)<='z')
			{
				consonantCount++;
			}
		}
		System.out.println("Vowel are:"+vowelcount);
		System.out.println("consonant are:"+consonantCount);

	}

}
