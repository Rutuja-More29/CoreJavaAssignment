package com.arraypractice;

import java.util.Arrays;

public class ReverseNumber {
	void reverse(int a[])
	{
		int n=a.length;
		int mid=n/2;
		for(int i=0;i<mid;i++)
		{
			int temp=a[i];
			a[i]=a[n-1-i];
			a[n-1-i]=temp;
		}
		System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args) {
		int a[]= {1,2,3,5,6,4};
		ReverseNumber r=new ReverseNumber();
		r.reverse(a);

	}

}
