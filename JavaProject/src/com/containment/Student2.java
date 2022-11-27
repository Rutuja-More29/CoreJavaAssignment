package com.containment;

public class Student2 {
	private int roll;
	private String sname;
	Department2 d2;
	Student2(int roll,String sname,Department2 d2)
	{
		this.roll=roll;
		this.sname=sname;
		this.d2=d2;
	}
	public String toString()
	{
		return roll+" "+sname+" "+d2;
	}
}
