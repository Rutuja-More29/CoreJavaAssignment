package collections;

import java.util.ArrayList;

public class StudentExample {
	int id;
	String name, dept;
	ArrayList<Integer> marks;
	float percentage;

	/*
	 * StudentExample(int id,String name,String dept) { this.id=id; this.name=name;
	 * this.dept=dept; } public StudentExample() { // TODO Auto-generated
	 * constructor stub }
	 */

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

	public void setMarks(ArrayList<Integer> marks) {
		this.marks = marks;
	}

	public float getPercentage() {
		return percentage;
	}

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}

	public String toString() {
		return id + " " + name + " " + dept;
	}
}
