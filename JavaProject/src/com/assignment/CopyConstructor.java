package com.assignment;

public class CopyConstructor {
	int id,salary;
	String name,dept;
	CopyConstructor(int id,String name,String dept,int salary)
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.salary=salary;
	}
	CopyConstructor(CopyConstructor c) // copy value from one object to another object
	{
		this.id=c.id;
		this.name=c.name;
		this.dept=c.dept;
		this.salary=c.salary;
	}
	void display()
	{
		System.out.println(id+" "+name+" "+dept+" "+salary);
	}
	public static void main(String[] args) {
		CopyConstructor c=new CopyConstructor(101,"abcd","dev",45000);
		CopyConstructor c1= new CopyConstructor(c);
		c.display();
		c1.display();
	}

}
