package com.arraypractice;

public class ReplaceNagative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {12,3,-19,5,-61,7,-9};
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<0)
			{
				a[i]=a[i-1]*a[i-1];
			}
			
			System.out.print(a[i]+" ");
		}
		

	}

}
