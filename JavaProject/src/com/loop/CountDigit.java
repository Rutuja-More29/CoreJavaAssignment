package com.loop;

import java.util.Scanner;

public class CountDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*int num, count = 0;
		System.out.println("Enter a number:");
		num = sc.nextInt();
		while (num > 0) { // we also use while(num!=0)
			num = num / 10;
			count++;
		}
		System.out.println("Number of digit:" + count);*/
		
		
		
		int num,sum=0,r;
		System.out.println("enter number:");
		num=sc.nextInt();
		while(num!=0)
		{
			r=num%10;
			sum=sum+r;
			num=num/10;
			
		}
		System.out.println("Addition:"+sum);
		
		
		
	}

}
