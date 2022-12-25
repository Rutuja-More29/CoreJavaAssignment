package com.array;

public class Square {

	public static void main(String[] args) {
		int a[]= {1,24,81,49,4,5};
		for(int i=0;i<a.length;i++) {
			double sqrt=Math.sqrt(a[i]);
			if(sqrt==Math.floor(sqrt))
			{
				System.out.print(a[i]+" ");
			}
		}
System.out.println();
	}
}