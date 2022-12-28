package com.stringpractice;

import java.util.Arrays;

public class EncryptedAlphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="KITE";
		String str[]=s.split("");
		int sum=0;
		System.out.println(Arrays.toString(str));
		for(int i=0;i<str.length;i++)
		{
			char ch[]=str[i].toCharArray();
			for(int j=0;j<ch.length;j++)
			{
				int a=ch[j]-64;
				sum=sum+a;
			}
			
		}
		System.out.println(sum);

	}

}
