package com.array;
import java.util.Arrays;
import java.util.Scanner;
public class Character {
	void characterCasing(char a[])
	{
		System.out.println("Original Array:"+Arrays.toString(a));
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>='a'&& a[i]<='z') {
				a[i]=((char)(a[i]-32));
			}
			else if(a[i]>='A' && a[i]<='Z') {
				a[i]=((char)(a[i]+32));
			}
			System.out.println("New Array:"+Arrays.toString(a));
		}
		
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size:");
		int size=sc.nextInt();
		char arr[]=new char [size];
		System.out.println("Enter array element:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.next().charAt(0);
		}
		Character c=new Character();
		c.characterCasing(arr);
	}

}
