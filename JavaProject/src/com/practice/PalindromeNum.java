package com.practice;

public class PalindromeNum {
	
	int r,sum=0,temp;
void palindrome(int num)
{
	temp=num;
	while(num>0)
	{
		r=num%10;
		sum=(sum*10)+r;
		num=num/10;
	}
		if(temp==sum)
		{
			System.out.println("palindrome");
		}
		else
			System.out.println("Not");
}
	public static void main(String[] args) {
	/*	int num=121;
		int r,sum=0,temp;
		temp=num;
		while(num>0)
		{
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
		}
			if(temp==sum)
			{
				System.out.println("palindrome");
			}
			else
				System.out.println("Not");*/
		
	PalindromeNum p=new PalindromeNum();
	p.palindrome(145);
	
	}

}
