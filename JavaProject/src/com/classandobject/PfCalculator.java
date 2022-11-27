package com.classandobject;
import java.util.Scanner;
public class PfCalculator {
	void pfCalculator(int salary)
	{
		System.out.println("Salary:"+salary*0.15);
	}
	public static void main(String []args) {
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		a=sc.nextInt();
		PfCalculator s=new PfCalculator();
		s.pfCalculator(a);
	}

}
