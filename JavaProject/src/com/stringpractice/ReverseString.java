package com.stringpractice;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello";
		String str=" ";
		char ch;
		for(int i=0;i<s.length();i++)
		{
			ch=s.charAt(i);
			str=ch+str;
		}
		System.out.println("Reversed word:"+str);

	}
	
}
