package com.polymorphism;
//inheritance
public class Car {
	int id,price;
	String name,color;
	Engine e;
	public void setE(Engine e)
	{
		this.e=e;
	}
	public Engine getE()
	{
		return e;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setColor(String  color)
	{
		this.color=color;
	}
	public String getColor()
	{
		return color;
	}
	public void setPrice(int price)
	{
		this.price=price;
	}
	public int getPrice()
	{
		return price;
	}
	

}
