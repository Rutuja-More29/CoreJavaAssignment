package com.abstraction;

public  class  Swift extends Car {
	
	Swift(String engine,int price)
	{
		this.engine=engine;
		this.price=price;
	}
	void display()
	{
		System.out.println(engine+" "+price);
	}
	 void dashboard()
	{
		System.out.println("Swift :ac,music system");
	}
	 void buildquality()
	{
		System.out.println("3 star rating");
	}
}
