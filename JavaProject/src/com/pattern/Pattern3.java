package com.pattern;
import java.util.Scanner;
public class Pattern3 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int count;
		System.out.println("Enter a number:");
		count=sc.nextInt();
		
		System.out.println("Fibonacci series are:");
		int f1=0,f2=1;
		int f3;
		System.out.println(f1+"\n"+f2);
		for( f3=1;f3<=count;f3++)
		{
			f3=f1+f2;
			System.out.println(f3);
			f1=f2;
			f2=f3;
		}	
		System.out.println();
	}

}
