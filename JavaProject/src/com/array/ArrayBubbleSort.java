package com.array;

import java.util.Arrays;

public class ArrayBubbleSort {

	public static void main(String[] args) {
		int a[]= {10,50,30,20,40,60,9,8};
	System.out.println(Arrays.toString(a));
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a.length-1;j++)
		{
			if(a[j]>a[j+1])
			{
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
	System.out.println(Arrays.toString(a));
	System.out.println("second maximum marks:"+a[a.length-1]);
	System.out.println("Second minimum marks:"+a[1]);
	}

}
