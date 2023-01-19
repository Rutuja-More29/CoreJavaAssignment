package writtencomparatorhashmap;

public class Student {
	int rollno,age;
	String name;
	Student(int rollno,String name,int age)
	{
		this.rollno=rollno;
		this.name=name;
		this.age=age;
	}
	public String toString()
	{
		return rollno+" "+name+" "+age;
	}

}
