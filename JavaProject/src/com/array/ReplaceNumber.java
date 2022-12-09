package com.array;

import java.util.Arrays;

public class ReplaceNumber {
	void replace(int a[])
	{
		System.out.println("original number:"+Arrays.toString(a));
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<0)
			{
				System.out.print(0+" ");
			}
			else
			{
				System.out.print(a[i]+" ");
			}
		}
	}

	public static void main(String[] args) {
		int arr[]= {2,-1,56,-2,67,-9,90,-5};
		 int a=arr.length;
		 ReplaceNumber r=new ReplaceNumber();
		 r.replace(arr);

	}

}
