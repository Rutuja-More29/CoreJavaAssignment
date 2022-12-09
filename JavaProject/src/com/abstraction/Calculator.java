package com.abstraction;

public interface Calculator {
	void addition(int a,int b);
	void substract(int a,int b);
	void multiply(int a,int b);
	void division(int a,int b);
}
class SciCalculator implements Calculator{

	@Override
	public void addition(int a, int b) {
		System.out.println("Addition:"+(a+b));
		
	}

	@Override
	public void substract(int a, int b) {
		System.out.println("Substraction:"+(a-b));
		
	}

	@Override
	public void multiply(int a, int b) {
		System.out.println("Multiplication:"+(a*b));
		
	}

	@Override
	public void division(int a, int b) {
		System.out.println("Division:"+(a/b));
		
	}
	public void square(int a)
	{
		System.out.println("Square:"+(a*a));
	}
	
}
