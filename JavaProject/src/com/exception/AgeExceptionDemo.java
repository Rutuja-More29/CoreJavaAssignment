package com.exception;

import java.util.Scanner;

public class AgeExceptionDemo  {
	void ageCheck(int age) throws AgeException
	{
		if(age<18)
		{
			throw new AgeException("Age is less...can not allowed ride");
		}
		else if(age>=60)
		{
			throw new AgeException("Age is grater....can not allowed ride");
		}
		else
		{
			System.out.println("Enjoy ride...");
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age:");
		int age=sc.nextInt();
	AgeExceptionDemo a=new AgeExceptionDemo();
	try
	{
		a.ageCheck(age);
	}
	catch(AgeException e)
	{
	e.printStackTrace();
	}
	System.out.println("done");

	}

}
