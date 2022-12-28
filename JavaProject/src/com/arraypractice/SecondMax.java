package com.arraypractice;

import java.util.Arrays;

public class SecondMax {

	public static void main(String[] args) {
		int a[]= {20,0,31,45,100,1,105,90};
		System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1]) {
					
				
				int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("Second Maximum:"+a[a.length-2]);

	}

}
