package com.arraypractice;

public class MaxColumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{22,31,9},{12,25,16},{34,42,2}};
		for(int i=0;i<a.length;i++)
		{
			int max=a[0][i];
			for(int j=0;j<a.length;j++)
			{
				if(a[i][j]>max)
				{
					max=a[i][j];
				}
			}
			System.out.println(max);
		}

	}

}
