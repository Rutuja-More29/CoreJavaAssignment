package com.inheritance;
//composition-containment
public class Car2 {
	private int carid,price;
	private String name,color;
	Driver d;
	Car2(int carid,String name,String color,int price,int id,String dname,int dcontact)
	{
		this.carid=carid;
		this.name=name;
		this.color=color;
		this.price=price;
		d=new Driver(id,dname,dcontact);
	}
	public String toString()
	{
		return carid+" "+name+" "+color+" "+price+" "+d;
	}

	public static void main(String[] args) {
		

	}

}
