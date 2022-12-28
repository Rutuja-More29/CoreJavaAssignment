package com.arraypractice;

import java.util.Arrays;

public class SecondMin {

	public static void main(String[] args) {
		int a[]= {10,40,50,5,9,2};
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
		System.out.println("Second Min:"+a[1]);
	}

}
