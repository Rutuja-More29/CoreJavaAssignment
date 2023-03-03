package iofile;

import java.io.Serializable;

public class Student implements Serializable {
	int id, marks;
	String name, dept;
	Student(int id,String name,String dept,int marks){
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.marks=marks;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
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

	public String toString() {
		return id + " " + name + " " + marks + " " + dept;
	}
}
