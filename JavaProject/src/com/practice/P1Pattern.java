package com.practice;

public class P1Pattern {

	public static void main(String[] args) {
		int num=8;
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=num;i++)
		{
			for(int j=num;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
