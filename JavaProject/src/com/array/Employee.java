package com.array;

public class Employee {
int id;float salary;
String name,dept;
Employee(int id,String name,String dept,float salary)
{
	this.id=id;
	this.name=name;
	this.dept=dept;
	this.salary=salary;
}
public String toString()
{
	return id+" "+name+" "+dept+" "+salary;
}
void hike()
{
	float incrementsal=((salary*10)/100);
	salary=salary+incrementsal;
}
}
