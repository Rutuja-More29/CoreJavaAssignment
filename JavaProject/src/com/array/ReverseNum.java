package com.array;

import java.util.Arrays;

public class ReverseNum {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8};
		int n=a.length;
		int mid=n/2;
		System.out.println(Arrays.toString(a));
		for(int i=0;i<mid;i++)
		{
			int temp=a[i];
			a[i]=a[n-4-i];
			a[n-4-i]=temp;
		}
		System.out.println(Arrays.toString(a));
	}

}
