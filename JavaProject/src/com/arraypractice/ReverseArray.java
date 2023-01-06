package com.arraypractice;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,90,45,29,37,78};
		System.out.println(Arrays.toString(arr));
		int n=arr.length;
		int mid=n/2;
		for(int i=0;i<mid;i++)
		{
			int temp=arr[i];
			arr[i]=arr[n-1-i];
			arr[n-1-i]=temp;
		}
		System.out.println(Arrays.toString(arr));
	}

}
