package com.abstraction;

public abstract class Car { 
	//cannot  create object of abstract class
	int price;
	String engine;
	
	void wheelno()  // concrete method
	{
		System.out.println("Every car has 4 wheels");
	}
	void headlight()
	{
		System.out.println("2 headlight");
	}
	abstract void dashboard();
	abstract void buildquality();
}
