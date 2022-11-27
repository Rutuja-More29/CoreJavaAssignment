package com.containment;

public class Student {
	private int roll;
	private String sname;
	Department d;
	public void setRoll(int roll)
	{
		this.roll=roll;
	}
	public int getRoll()
	{
		return roll;
	}
	public void setName(String sname)
	{
		this.sname=sname;
	}
	public String getSname()
	{
		return sname;
	}
	public void setD(Department d)
	{
		this.d=d;
	}
	public Department getD()
	{
		return d;
	}
	public String toString()
	{
		return roll+" "+sname+" "+d;
	}

}
