package writtenarray;

import java.util.Scanner;

public class SumLowerTriangle {
	void sumLowerTriangular(int a[][])
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(i>j)
				{
					sum=sum+a[i][j];
				}
			}
		}
		System.out.println("Sum of lower triangular matrix is:"+sum);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=3,c=3;
		int a[][]=new int[r][c];
		System.out.println("Enter array element :");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				 a[i][j]=sc.nextInt();
			}
		}
		
		SumLowerTriangle slt=new SumLowerTriangle();
		slt.sumLowerTriangular(a);

	}

}
