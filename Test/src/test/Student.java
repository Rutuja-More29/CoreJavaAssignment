package test;

public class Student {
	int id,marks;
	String name;
	Course c;
	Student(int id,String name,int marks,Course c){
		this.id=id;
		this.name=name;
		this.marks=marks;
		this.c=c;
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
	public Course getC() {
		return c;
	}
	public void setC(Course c) {
		this.c = c;
	}
	public String toString() {
		return id+" "+name+" "+marks+" "+c;
	}
}
