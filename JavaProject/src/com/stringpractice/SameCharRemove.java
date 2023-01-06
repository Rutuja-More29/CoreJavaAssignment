package com.stringpractice;

import java.util.Arrays;

public class SameCharRemove {

	public static void main(String[] args) {
		String s="abababcabbcaab";
		char ch[]=s.toCharArray();
		System.out.println(Arrays.toString(ch));
		int len=ch.length;
		for(int i=0;i<len;i++)
		{
			if(i==len-1 || i==len-2)
			{
				s=s+ch[i];
			}
			else
			{
				if(ch[i]=='b' && ch[i+1]=='c'&& ch[i+2]=='a')
				{
					i=i+2;
				}
				else
				{
					s=s+ch[i];
				}
			}
		}
		System.out.println(s);
	}

}
