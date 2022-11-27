package com.classandobject;

public class InstanceBlock {
	int id,salary;
	String name,dept;
	void setData(int id,String name,String dept,int salary) {
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.salary=salary;
		this.Display(); // use one method in another method using this keyword
	}
	void Display() {
		System.out.println("in instance block .......");
		id=1;
		name="abcd";
		dept="dev";
		
	}
	InstanceBlock(){
		System.out.println("simple constructor.....");
		id=0;
		name="pqrs";
		
	}

	public static void main(String[] args) {
		InstanceBlock ib=new InstanceBlock();
		//ib.InstanceBlock();

	}

}
