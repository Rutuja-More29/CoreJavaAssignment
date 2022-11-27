package com.classandobject;
import java.util.Scanner;
public class CalculatorParameter {
	void add(int x ,float y)
	{
		System.out.println("Addition:"+(x+y));
	}
	void multiply(int a, int b )
	{
		System.out.println("Multiplication:"+(a*b));
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.println("Enter two numbers:");
		a=sc.nextInt();
		b=sc.nextInt();
		CalculatorParameter c1 = new CalculatorParameter();
		c1.add(a, b);
		c1.multiply(a, b);
	}

}
