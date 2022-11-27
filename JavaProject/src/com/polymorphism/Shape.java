package com.polymorphism;

public class Shape {
	void area(int a)    // method overloading
	{
		System.out.println("Area of Square:"+(a*a));
		
	}
	void area(int a,int b)
	{
		System.out.println("Area of Rectangle:"+(a*b));
		
	}
	
	void area(float r)
	{
		System.out.println("Area of circle:"+(3.14f+r));
	}
	
	void area(int a,float l)
	{
		System.out.println("Area of Trianlge:"+(0.5*a*l));
	}
		
	
	

	public static void main(String[] args) {
		Shape s=new Shape();
		s.area(5);
		s.area(4, 3);
		s.area(2);
		s.area(6, 4);
	}

}
