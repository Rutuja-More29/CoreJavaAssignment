package com.test;

import java.util.Scanner;

//WAP in java to input a number and check whether it is a Keith Number or not
public class KeithNumber {
	void check(int arr[],int num) {
		int sum=0;
		int i,temp;
		String s=Integer.toString(num);
		int len=s.length();
		temp=num;
		for(  i=len-1;i>=0;i--) {
			arr[i]=temp%10;
			temp=temp/10;
			
		}
		i=len;
		while(sum<num) {
			for(int j=1;j<=len;j++) {
				sum=sum+arr[i-j];
			}
			arr[i]=sum;
			i++;
		}
		if(sum==temp)
			System.out.println("keinth number");
		else
			System.out.println("not keinth number");
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int num=sc.nextInt();
		
		int arr[]=new int[num];
		
		KeithNumber k=new KeithNumber();
		k.check(arr, num);
	}
}
