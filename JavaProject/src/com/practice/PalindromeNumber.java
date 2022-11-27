package com.practice;

public class PalindromeNumber {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int num=121;
		int remainder,sum=0,temp;
		temp=num;
		while(num>0)
		{
			remainder=num%10;
			sum=(sum*10)+remainder;
			num=num/10;
		}
		if(temp==sum)
			System.out.println("palindrome num");
		else
			System.out.println("not");
		
		
		
		
	}

}
