package com.classandobject;

public class ConstructorChaining {
	ConstructorChaining()        // recursion not allow
	{
		this(10);
		System.out.println("In simple  constructor");
	}
	ConstructorChaining(int x)
	{
		this(11,12);
		System.out.println("In  one parametr constructor");
	}
	ConstructorChaining(int x, int y)
	{
		this(14,15,16);
		System.out.println("in two parameter constructor");
	}
	ConstructorChaining(int x,int y,int z)
	{
		System.out.println("In three parametr constructor");
	}
	

	public static void main(String[] args) {
		new ConstructorChaining();      // call constructorChaining

	}

}
