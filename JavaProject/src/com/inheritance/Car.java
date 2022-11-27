package com.inheritance;
//using constructor
public class Car {
	int id,price;
	String name,color;
	Engine e;
	Car(int id,String name,String color,int price,Engine e)
	{
		this.id=id;
		this.name=name;
		this.color=color;
		this.price=price;
		this.e=e;
	}
	public String toString()
	{
		return id+" "+name+" "+color+" "+price+" "+e;
	}

	public static void main(String[] args) {
		

	}

}
