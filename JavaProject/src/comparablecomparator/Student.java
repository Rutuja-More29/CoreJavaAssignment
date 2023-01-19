package comparablecomparator;

import java.util.ArrayList;

public class Student implements Cloneable{
	String name;
	ArrayList<Integer>marks;
	private Object Student;
	Student(String name,ArrayList<Integer>marks)
	{
		this.name=name;
		this.marks=marks;
	}
	public String toString()
	{
		return name+" "+marks;
	}
	public Object clone() throws CloneNotSupportedException
	{
		
		Student s=(Student)super.clone();
		s.marks=(ArrayList<Integer>)marks.clone();
		return s;
	}

}
