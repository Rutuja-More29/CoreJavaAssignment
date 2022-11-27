package com.classandobject;

public class ConstructEmployee {
	int id;
	int salary;
	String name;
	String dept;
	float pf;
	ConstructEmployee() // default constructor
	{
		
	}
	void display()
	{
		System.out.println(id+" "+name+" "+salary+" "+dept+" "+pf);
	}

	public static void main(String[] args) {
		// classname var_ref=new constructor
		ConstructEmployee ce=new ConstructEmployee();  // create object
		ce.display();

	}

}
