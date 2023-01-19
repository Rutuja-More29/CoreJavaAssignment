package map;

public class Student1 {
	int marks;
	String name,email;
	Student1(String name,String email,int marks)
	{
		this.name=name;
		this.email=email;
		this.marks=marks;
	}
	public String toString()
	{
		return name+" "+email+" "+marks;
	}
}
