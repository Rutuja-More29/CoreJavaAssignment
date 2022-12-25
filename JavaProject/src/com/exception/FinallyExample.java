package com.exception;

public class FinallyExample {

	public static void main(String[] args) {
		int a=1000,b=0;
		try
		{
			System.out.println("Division is:"+(a/b));
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("inside finally block");
		}
		System.out.println("done");

	}

}
