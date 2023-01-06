package com.practice;

import java.util.Scanner;

public class Test2 {
	void sum(String s)
	{
	
		int sum=0;
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='0' && ch[i]<='9')
			{
				sum=sum+s.charAt(i)-48;
			}
		}
		System.out.print(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//find out sum of digit from string
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=sc.next();
		Test2 t=new Test2();
		t.sum(s);

	}

}
