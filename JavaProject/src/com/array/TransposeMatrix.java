package com.array;

import java.util.Scanner;

public class TransposeMatrix {

	public static void main(String[] args) {
		int i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter total rows,columns:");
		int row=sc.nextInt();
		int column=sc.nextInt();
		int a[][]=new int[row][column];
		System.out.println("Enter arrays element:");
		for( i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
				a[i][j]=sc.nextInt();
				
			}
		}
		System.out.println("Original Matrix is:");
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
				System.out.print(a[i][j]+"\t ");
			}
			System.out.println();
		}
		
		System.out.println("Transpose Matrix is:");
		for(i=0;i<column;i++)
		{
			for(j=0;j<row;j++)
			{
				System.out.print(a[j][i]+"\t ");
			}
			System.out.println();
		}
		
	}

}
