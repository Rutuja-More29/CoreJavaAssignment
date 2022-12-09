package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class UserInputArray {
	void evenElement(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
		}
	}
	void addition(int a[])
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				sum=sum+a[i];
			}
			System.out.println("The Sum:"+sum);
		}
	}
	void prime(int a[])
	{	
		for(int i=0;i<a.length;i++)
		{	int mid=a[i]/2,j;
			for( j=2;j<=mid;j++)
			{
				if(a[i]%j==0) {
					break;
				}
			}
				if(j>mid)
				{
					System.out.println("prime number:"+a[i]);
				}
			}
		}
		void indexElement(int a[])
		{
			for(int i=0;i<a.length;i++)
			{
				if(i%2==0)
				{
					System.out.println("Element:"+a[i]+"Index: "+i);
				}
			}
		}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a array size:");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter element are:");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array element are:");
		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i] + " ");
		}
		System.out.println(Arrays.toString(arr));
		UserInputArray uai=new UserInputArray();
		uai.addition(arr);
		uai.prime(arr);
		uai.evenElement(arr);
	}

}
