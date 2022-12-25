package com.array;

import java.util.Scanner;

public class AdditionOfRowElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=3,c=3;
		int a[][]=new int [r][c];
		System.out.println("Enter array element:");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
			}
			
		}
		int sum=0;
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				sum=sum+a[i][j];
			}
		}
		System.out.println("Addition of rows element:"+sum);
	}

}
