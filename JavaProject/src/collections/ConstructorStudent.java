package collections;

import java.util.ArrayList;

public class ConstructorStudent {
	int id;
	String name,dept;
	ArrayList<Integer>marks;
	ConstructorStudent(int id,String name, String dept,ArrayList<Integer>marks){
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.marks=marks;
		
	}
	public String toString()
	{
		return id+" "+name+" "+dept+" "+marks;
	}

}
