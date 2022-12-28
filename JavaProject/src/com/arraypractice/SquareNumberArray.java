package com.arraypractice;

import java.util.Arrays;

public class SquareNumberArray {

	public static void main(String[] args) {
	int a[]= {10,21,14,16,9};
	System.out.println(Arrays.toString(a));
	for(int i=0;i<a.length;i++)
	{
		double sqrt=Math.sqrt(a[i]);
		if(sqrt==Math.floor(sqrt))
		{
			System.out.println(a[i]+" ");
		}
	}

	}

}
