package com.classandobject;

public class StaticBlockExample {
	static int a;
	static
	{
		a=10;          // static block call
	}

	public static void main(String[] args) {
		System.out.println(StaticBlockExample.a);

	}

}
