package com.arraypractice;

import java.util.Arrays;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {-20,0,-25,15,19,37,23};
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("Second min:"+arr[1]);

	}

}
