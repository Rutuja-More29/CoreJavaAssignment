package com.pattern;
import java.util.Scanner;
public class Pattern2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter a number:");
		num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		for(int i=1;i<=9;i++)
		{
			System.out.print(i);
		}
		System.out.println();
		for( int i=num;i>=1;i--)
		{
		for(int j=1;j<=i;j++)
		{
			System.out.print(j);
		}
		System.out.println();
		}
	}

}
