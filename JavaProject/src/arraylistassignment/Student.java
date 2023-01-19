package arraylistassignment;
import java.util.ArrayList;
public class Student {
	int id;
	String name;
	ArrayList<Integer>marks;
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
	public ArrayList<Integer> getMarks() {
		return marks;
	}
	public void setMarks(ArrayList<Integer> marks) {
		this.marks = marks;
	}
	public String toString()
	{
		return id+" "+name+" "+marks;
	}
}
