package com.array;
import java.util.Scanner;
public class AverageMarks {
	void averageMarks(int a[])
	{
		
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		double average=sum/(a.length);
		System.out.println("Average Marks:"+average);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element array size:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter Marks are:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		AverageMarks a=new AverageMarks();
		a.averageMarks(arr);
	}

}
