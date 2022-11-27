package com.containment;

public class Department2 {
	private int id;
	private String dname;
	Department2(int id,String dname)
	{
		this.id=id;
		this.dname=dname;
	}
	public String toString()
	{
		return id+" "+dname;
	}
}
