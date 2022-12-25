package com.exception;

public class SimpleException {
	void add(int a,int b)
	{
		System.out.println("Addition:"+(a+b));
		
	}
	void multiply(int a,int b)
	{
		System.out.println("Multiplication:"+(a*b));
	}
	void division(int a,int b)
	{
		System.out.println("Division:"+(a/b));
	}
	void substract(int a,int b)
	{
		System.out.println("Division:"+(a-b));
	}

	public static void main(String[] args) {
		int a=150,b=0;
		SimpleException s=new SimpleException();
		s.add(a, b);
		s.multiply(a, b);
		try
		{
		s.division(a, b);
		}
		catch(ArithmeticException e)
		{
			//System.out.println(e);
			e.printStackTrace();
		}
		s.substract(a, b);
	}

}
