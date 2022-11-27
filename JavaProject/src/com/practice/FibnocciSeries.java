package com.practice;

public class FibnocciSeries {
		
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f1=0,f2=1;
		System.out.println(f1+" \n"+f2);
		int count=5;
		for(int f3=2;f3<=count;f3++)
		{
			f3=f1+f2;
			System.out.println(f3);
			f1=f2;
			f2=f3;
		}
	}

}
