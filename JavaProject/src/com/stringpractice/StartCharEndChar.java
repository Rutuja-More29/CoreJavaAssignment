package com.stringpractice;

public class StartCharEndChar {

	public static void main(String[] args) {
		String s[]= {"Rutuja","Komal","Riya","Rama","Vihan","aman"};
		
		for(int i=0;i<s.length;i++)
		{
			char ch[]=s[i].toCharArray();
			if(ch[0]=='R')
			{
				String s1=new String(ch);
				System.out.println("Start with:"+s1);
			}
			if(ch[ch.length-1]=='n')
			{
				String s2=new String(ch);
				System.out.println("End with:"+s2);
			}
		}

	}

}
