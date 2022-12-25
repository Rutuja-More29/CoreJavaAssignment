package com.string;

public class StringExample3 {

	public static void main(String[] args) {
		String s="Java Language";
		char ch='a';
		char ch1[]=s.toCharArray();
		
		for(int i=0;i<ch1.length;i++)
		{
			if(ch1[i]=='a')
			
				ch1[i]='A';
			
		}
		String s1=new String(ch1);
		System.out.println(s1);
		

	}

}
