package com.containment;

public class Mydate2 {
	private String day,month;
	private int year;
	Mydate2(String day,String month,int year)
	{
		this.day=day;
		this.month=month;
		this.year=year;
	}
	public String toString()
	{
		return day+" "+month+" "+year;
	}
}
