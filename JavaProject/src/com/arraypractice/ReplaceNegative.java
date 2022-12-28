package com.arraypractice;

import java.util.Arrays;

public class ReplaceNegative {

	public static void main(String[] args) {
		int a[]= {1,2,-3,4,5,-6,87,-9,1};
		System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<0)
			{
				a[i]=a[i-1]*a[i-1];
			}
			System.out.print(a[i]+" ");
		}

	}

}
