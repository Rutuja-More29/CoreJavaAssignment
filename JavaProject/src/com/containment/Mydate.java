package com.containment;

public class Mydate {
	private String day,month;
	private int year;
	public void setDay(String day)
	{
		this.day=day;
	}
	public String getDay()
	{
		return day;
	}
	public void setMonth(String month)
	{
		this.month=month;
	}
	public String getMonth()
	{
		return month;
	}
	public void setYear(int year)
	{
		this.year=year;
	}
	public int getYear()
	{
		return year;
	}
	public String toString()
	{
		return day+" "+month+" "+year;
	}
}
