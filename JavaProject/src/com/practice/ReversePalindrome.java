package com.practice;

public class ReversePalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,rev=0,rem,i,num=500;
		for(i=100;i<500;i++) {
			n=i;
			while(n>0)
			{
				rem=n%10;
				rev=(rev*10)+rem;
				n=n/10;
			}
			if(rev==i)
				System.out.println(i);
			rev=0;
		}
		
	}

}
