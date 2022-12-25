package com.pojo;

public class Student {
	private int id, marks;
	private String name, email, dept;
	private long contact;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getMarks(int marks) {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getConatct() {
		return contact;
	}

	public void setConatct(long contact) {
		this.contact = contact;
	}

	public String toString() {
		return id + " " + name + " " + marks + " " + dept + " " + email + " " + contact;
	}
}
