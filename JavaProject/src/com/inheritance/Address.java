package com.inheritance;

public class Address {
	private String area,city,state;
	private int pincode;
	Address(String area,String city,int pincode,String state)
	{
		this.area=area;
		this.city=city;
		this.pincode=pincode;
		this.state=state;
	}
	public String toString()
	{
		return area+" "+city+" "+pincode+" "+state;
	}
}
