package com.stringpractice;

import java.util.Arrays;

public class RemoveOccuranceWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Core java advance java";
		String[] str=s.split(" ");
		System.out.println(Arrays.toString(str));
		String str1[]=new String[str.length];
		
		String s1=" ";
		for(int i=0;i<str.length;i++)
		{
			if(str[i].equalsIgnoreCase("java")){
				continue;	
			}
			else
			{
				s1=s1+str[i]+" ";
			}
		
		
		}
		System.out.println(s1);
	}

}
