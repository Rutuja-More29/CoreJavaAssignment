package com.pattern;
import java.util.Scanner;
public class DownwardSameNumTri {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter a number:");
		num=sc.nextInt();
		for(int i=num;i>=0;i--)
		{
			for(int j=1;j<=i;j++ )
			{
				System.out.print(i);
			}
			System.out.println();
		}

	}

}
