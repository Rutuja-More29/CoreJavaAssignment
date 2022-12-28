package com.arraypractice;

public class MinValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{22,31,9},{12,25,16}};
		for(int i=0;i<a.length;i++)
		{
			int min=a[i][0];
			for(int j=0;j<a.length;j++)
			{
				if(min>a[i][j])
				{
					min=a[i][j];
				}
			}
			System.out.println(min);
		}

	}

}
