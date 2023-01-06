package com.arraypractice;

public class Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {26,0,67,45,0,78,54,34,10,0,34};
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
			{
				System.out.print(1+" ");
			}
			else
				System.out.print(a[i]+" ");
		}
		System.out.println();

	}

}
