package com.arraypractice;

import java.util.Arrays;

public class DuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {3,10,90,78,56,10,78,34,61};
		System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length-1;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[j]);
				}
			}
			
		}
		

	}

}
