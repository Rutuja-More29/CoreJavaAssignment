package writtenarray;

import java.util.Scanner;

public class SymmetricMatrix {
	void symmetricMatrix(int row,int col,int a[][])
	{
		int flag=1;
		System.out.println("Matrix is:");  // original matrix
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(a[i][j]);
			}
		}
		System.out.println();
		int transpose [][]=new int [row][col];
		for(int i=0;i<row;i++)                  // transpose matrix
		{
			for(int j=0;j<col;j++)
			{
				transpose[j][i]=a[i][j];
			}
		}
		if(row==col)
		{
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					if(a[i][j]!=transpose[j][i])
					{
						flag=0;
						break;
					}
				}
				if(flag==0)
				{
					System.out.println("The maritx is no symmetric");
					break;
					
				}
				
			}
			if(flag==1)
			{
				System.out.println("The matrix is symmetric");
			}
			else
			{
				System.out.println("The matrix is not symmetric");
			}
		}
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int row,col;
		
		System.out.println("Enter number of rows:");
		row=sc.nextInt();
		System.out.println("Enter number of column:");
		col=sc.nextInt();
		int a[][]=new int[row][col];
		System.out.println("Enter element:");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		SymmetricMatrix sm=new SymmetricMatrix();
		sm.symmetricMatrix(row, col, a);
	}

}
