package com.pattern;
import java.util.Scanner;
public class EndNumSame {

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
			for(int j=(i-1);j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
