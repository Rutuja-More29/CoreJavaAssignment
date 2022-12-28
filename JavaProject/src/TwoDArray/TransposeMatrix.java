package TwoDArray;

import java.util.Scanner;

public class TransposeMatrix {
	void transpose(int row,int col,int a[][])
	{
		
		System.out.println("original matrix:");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			
		}
		System.out.println();
		System.out.println("Transpose matrix:");
		for(int i=0;i<col;i++)
		{
			for(int j=0;j<row;j++)
			{
				System.out.print(a[j][i]+"\t");
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter row ,column:");
		int row=sc.nextInt();
		int col=sc.nextInt();
		int a[][]=new int[row][col];
		System.out.println("Enter array element:");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		TransposeMatrix t=new TransposeMatrix();
		t.transpose(row, col, a);
	}

}
