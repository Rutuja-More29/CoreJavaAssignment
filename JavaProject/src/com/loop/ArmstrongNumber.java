package com.loop;
import java.util.Scanner;
public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter a Number:");
		n=sc.nextInt();
		int leng=0;
		int t1=n;
		while(t1!=0)
		{
			leng=leng+1;
			t1=t1/10;
		}
		int t2=n;
		int arm=0;
		int rem;
		while(t2!=0)
		{
			int mul=1;
			rem=t2%10;
			for(int i=1;i<=leng;i++)
			{
				mul=mul*rem;
			}
			arm=arm+mul;
			t2=t2/10;
		}
		if(arm==n)
		{
			System.out.println("armstrong number"+n);
		}
		else
		{
			System.out.println("not rmstrong number"+n);
		}
	}

}
