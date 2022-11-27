package com.pattern;
import java.util.Scanner;
public class CountTri {

	public static void main(String[] args) {
		int count=1;
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter a number:");
		num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(count);
				count++;
			}
			System.out.println();
		}
		/*for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print( count );
				count++;
			}
			System.out.println();
		}*/

	}

}
