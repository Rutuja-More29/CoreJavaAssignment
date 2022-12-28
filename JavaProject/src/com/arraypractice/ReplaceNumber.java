package com.arraypractice;

import java.util.Arrays;

public class ReplaceNumber {
	void replaceNum(int a[])
	{
		
		
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]==0)
				{
					System.out.print(1+" ");
				}
				else
				{
					System.out.print(a[j]+" ");
				}
			}
		
	}

	public static void main(String[] args) {
		int a[]= {12,0,7,9,0,5,0,6,0,1};
		System.out.println(Arrays.toString(a));
		ReplaceNumber r=new ReplaceNumber();
		r.replaceNum(a);
	}

}
