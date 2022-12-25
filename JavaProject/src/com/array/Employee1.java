package com.array;

public class Employee1 {
int id;
float salary;
String name,dept;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
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
