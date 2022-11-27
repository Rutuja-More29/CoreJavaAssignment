package com.containment;

public class Employee {
	private int id,salary;
	private String name;
	Dept d;
	Mydate m;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Dept getD() {
		return d;
	}
	public void setD(Dept d) {
		this.d = d;
	}
	public Mydate getM() {
		return m;
	}
	public void setM(Mydate m) {
		this.m = m;
	}
	public String toString()
	{
		return id+" "+name+" "+salary+" "+d+" "+m;
	}
}
