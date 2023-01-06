package com.practice;

import java.util.Scanner;

public class Test {
	void evenDigit(int num)
	{
		int digit=0;
		for(int i=0;i<=num;i++)
		{
			if(num!=0)
			{
				digit=num%10;
				num=num/10;
			}
			if( digit%2==0)
			{
				
				System.out.println(digit);
			}
			
			
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// take one number from user and display even digit from that number
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int num=sc.nextInt();
		Test t=new Test();
		t.evenDigit(num);

	}

}
