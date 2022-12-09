package com.abstraction;

public class Television extends Elecetronics {
	Television(int price ,String color,int weight)
	{
		this.price=price;
		this.color=color;
		this.weight=weight;
	
		
	}
	void display()
	{
		System.out.println(price+" "+color+" "+weight);
	}
	void rating()
	{
		System.out.println("4 star rating");
	}
	void electricityConsumption()
	{
		System.out.println("50 watts");
	}
	void features()
	{
		System.out.println("vedio ,music system,app store");
	}
}
