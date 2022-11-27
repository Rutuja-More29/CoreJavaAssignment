package com.classandobject;

public class EmployeeConst {

	
int id,salary;
String name,dept;
float pf;
EmployeeConst(int id,String name,String dept,int salary,float pf)
{
	this.id=id;
	this.name=name;
	this.dept=dept;
	this.salary=salary;
	this.pf=pf;
}
void display()
{
	System.out.println(id+" "+name+" "+dept+" "+salary+" "+pf);
}
public  String toString()
{
	return id+" "+name+" "+dept+" "+salary+" "+pf;
}
public static void main(String[] args) {
	EmployeeConst e=new EmployeeConst(101,"abcd","dev",6700,0.10f);
	e.display();// using method to print
	System.out.println(e); // without using display method to print
	EmployeeConst e1=new EmployeeConst(102,"anay","dev",55000,0.10f);
	System.out.println(e1);
}
}
