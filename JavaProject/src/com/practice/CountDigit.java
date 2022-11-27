package com.practice;

public class CountDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int remainder,sum=0,num=50;
		while(num>0)
		{
			remainder=num%10;
			sum=sum+remainder;
			num=num/10;
		}
		System.out.println(sum);
	}

}
