package com.stringpractice;

import java.util.Arrays;

public class SplitString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="HELLO@WORLD";
		String str[]=s.split("@");
		System.out.println(Arrays.toString(str));
		for(int i=0;i<str.length;i++)
		{
			/*for(int j=str[i].length()-1;j>=0;j--)
			{
				System.out.print(str[i].charAt(j));
			}
			System.out.println();*/
			for(int j=0;j<str[i].length()-1;j++)
			{
				System.out.print(str[i].charAt(j));
			}
		}

	}

}
