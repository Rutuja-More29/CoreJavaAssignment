package com.pattern;
import java.util.Scanner;
public class SeriesPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		int a1=0,a2=1,a3;
		System.out.println("Enter Number:");
		num=sc.nextInt();
		for(int i=0;i<=num;i++) {
			a3=a2+i*i;
			a2=a3;
			System.out.print(a3+" ");
		}

	}

}
