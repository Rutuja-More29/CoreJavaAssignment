package com.pattern;
import java.util.Scanner;
public class pattern1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter a number:");
		num=sc.nextInt();
		for (int i =1; i <= num; i++) {
			for (int j =num; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
