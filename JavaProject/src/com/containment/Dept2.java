package com.containment;

public class Dept2 {
	private int dept_id;
	private String dept_name;
	Dept2(int dept_id,String dept_name)
	{
		this.dept_id=dept_id;
		this.dept_name=dept_name;
	}
	public String toString()
	{
		return dept_id+" "+dept_name;
	}
}
