package com.array;

import java.util.Arrays;

public class NegativeNumPreviousNumSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,12,-2,3,11,-4,5,10,-6,7,14,-8,9,13,-1,12};
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<0)
			{
			arr[i]=arr[i-1]*arr[i-1];
		}
		}
		System.out.println(Arrays.toString(arr));
	}

}
