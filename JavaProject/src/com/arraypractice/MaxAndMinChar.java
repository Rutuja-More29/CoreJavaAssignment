package com.arraypractice;

import java.util.Arrays;

public class MaxAndMinChar {
		void maxMinChar(char a[])
		{
			System.out.println(Arrays.toString(a));
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a.length-1;j++)
				{
					if(a[j]>a[j+1])
					{
						char temp=a[j];
						a[j]=a[j+1];
						a[j+1]=temp;
						
					}
				}
				
			}
			System.out.println("Max char:"+a[a.length-2]);
			System.out.println("Min char:"+a[0]);
			
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a[]= {'A','B','D','x','y','R'};
		
		MaxAndMinChar m=new MaxAndMinChar();
		m.maxMinChar(a);

	}

}
