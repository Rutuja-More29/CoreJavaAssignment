package com.arraypractice;

public class DuplicateNumber {

	public static void main(String[] args) {
		int a[]= {10,30,4,79,4,10,5};
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
