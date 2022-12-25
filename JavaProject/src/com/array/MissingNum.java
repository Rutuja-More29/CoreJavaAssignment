package com.array;

public class MissingNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,6,8,9};
		int j=1;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=j)
			{
				System.out.println(j);
				j++;                          // i-- then print  two or three number miss in sequence
			}
			j++;
		}

	}

}
