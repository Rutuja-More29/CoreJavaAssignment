package com.string;

public class CharacterAddition {

	public static void main(String[] args) {
		String s1="KITE";         // WORLD
		char ch[]=s1.toCharArray();
		int sum=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='A'&& ch[i]<='Z')
			{
				sum=sum+(ch[i]-64);         // A=1       ASCII 'A'=65     65-1=64
			}
		}
		System.out.println(sum);
	}

}
