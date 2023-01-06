package com.arraypractice;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,5,6,7,2,8,};
		int sum=0;
		double average=0;
		for(int i=0;i<a.length;i++)
		{
		
			
				sum=sum+a[i];
			
				 average=sum/(a.length);
		}
		System.out.println(average);

	}

}
