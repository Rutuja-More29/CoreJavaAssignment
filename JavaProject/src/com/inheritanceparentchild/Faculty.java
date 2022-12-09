package com.inheritanceparentchild;

public class Faculty extends Student {
	String subject;
	int salary;
	void pfCalculate(int salary)
	{
		System.out.println("Salary:"+salary*0.50);
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	

}
