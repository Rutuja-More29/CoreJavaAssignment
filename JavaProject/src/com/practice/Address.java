package com.practice;

public class Address {
	private String area,city;
	private int pincode;
	public void setArea(String area)
	{
		this.area=area;
	}
	public String getArea()
	{
		return area;
	}
	public void setCity(String city)
	{
		this.city=city;
	}
	public String getCity()
	{
		return city;
	}
	public void setPincode(int pincode)
	{
		this.pincode=pincode;
	}
	public int getPincode()
	{
		return pincode;
	}
	public String toString ()
	{
		return area+" "+city+" "+pincode;
	}
}
