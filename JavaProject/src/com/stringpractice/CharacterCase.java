package com.stringpractice;

import java.util.Scanner;

public class CharacterCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String str=sc.next();
		String ouputstr=" ";
		
		for(int i=0;i<str.length();i++)
		{
			if(Character.isUpperCase(str.charAt(i)))
			{
				ouputstr=ouputstr+Character.toLowerCase(str.charAt(i));
			}
			else
			{
				ouputstr=ouputstr+Character.toUpperCase(str.charAt(i));
			}
		}
		System.out.println(ouputstr);

	}

}
