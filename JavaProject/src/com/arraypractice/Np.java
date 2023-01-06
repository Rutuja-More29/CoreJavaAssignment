package com.arraypractice;

public class Np {
	public static void main(String []args)
	{
		int a[]= {2,4,5,-1,4,-3,7,-2,8};
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<0)
			{
				System.out.print(a[i]+" ");
			}
		}
		
		for(int j=0;j<a.length;j++)
		{
			if(a[j]>0)
			{
				System.out.print(a[j]+" ");
			}
		}
		System.out.println();
	}

}
