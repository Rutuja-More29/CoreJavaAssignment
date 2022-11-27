package com.loop;
import java.util.Scanner;
public class Power {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num,power=1,exponent;
		System.out.println("enter a number:");
		num=sc.nextInt();
		System.out.println("enter a exponent:");
		exponent=sc.nextInt();
		for(int i=1;i<=exponent;i++)
		{
			power=power*num;
		}
		System.out.println("Result:"+power);
	}

}
