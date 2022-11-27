package com.classandobject;

public class EmployeeConstruct {
	int id,salary;
	String name,dept;
	
	EmployeeConstruct (int i,String n,int s,String d)     //parameterized constructor
	{
		id=i;
		name=n;
		salary=s;
		dept=d;
	}
	void display()
	{
		System.out.println(id+" "+name+" "+salary+" "+dept);
	}
	public static void main(String[] args) {
		EmployeeConstruct ec=new EmployeeConstruct (101,"abc",1,"dd");
				ec.display();
					
	}

}
