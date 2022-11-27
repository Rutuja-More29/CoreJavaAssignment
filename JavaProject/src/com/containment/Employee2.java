package com.containment;

public class Employee2 {
	private int id, salary;
	private String name;
	Dept2 d2;
	Mydate2 m2;

	Employee2(int id, String name, int salary, Dept2 d2, Mydate2 m2) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.d2 = d2;
		this.m2 = m2;
	}

	public String toString() {
		return id + " " + name + " " + salary + " " + d2 + " " + m2;
	}
}
