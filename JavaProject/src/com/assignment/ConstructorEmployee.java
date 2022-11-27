package com.assignment;

public class ConstructorEmployee {
	 int id,sal;
	 String name;
	ConstructorEmployee()
	{
		id=101;
		name="bbb";
	}
	ConstructorEmployee(int id,String name,int sal)
	{
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
	void display()
	{
		System.out.println(id+" "+name+" "+sal);
	}

	public static void main(String[] args) {
		ConstructorEmployee ce=new ConstructorEmployee(101,"aaa",29854);
		ConstructorEmployee ce1=new ConstructorEmployee();
		ce1.display();
		ce.display();
	}
	

}
