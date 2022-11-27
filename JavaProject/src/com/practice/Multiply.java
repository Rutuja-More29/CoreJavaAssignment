package com.practice;
//polymorphism-method overloading
public class Multiply {
	void multiply(int a)
	{
		System.out.println("Multipliction:"+a);
	}
	void multiply(int a,int b)
	{
		System.out.println("Multiplication of 2 number:"+(a*b));
	}
	void multiply(int a,int b,int c)
	{
		System.out.println("Multiplication of 3 number:"+(a*b*c));
		
	}
	void multiply(int b,float d)
	{
		System.out.println("Multiplication:"+(b*d));
	}
	

	public static void main(String[] args) {
		Multiply m=new Multiply();
		m.multiply(5);
		m.multiply(4, 6);
		m.multiply(5, 3, 2);
		m.multiply(6, 8);
		
		
	}

}
