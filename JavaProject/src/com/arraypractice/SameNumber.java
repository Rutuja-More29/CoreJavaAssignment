package com.arraypractice;

import java.util.Arrays;

public class SameNumber {

	public static void main(String[] args) {
		int a[]= {1,2,3,2,4,1};
		
		System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
				System.out.println(a[j]);	
				}
			}
			
		
		}

	}

}
