package comparablecomapratorassignment;

public class Person implements Comparable<Person>{

	int age;
	String name;
	long contact;
	Person(int age,String name,long contact)
	{
		this.name=name;
		this.age=age;
		this.contact=contact;
	}
	public String toString()
	{
		return name+" "+age+" "+contact;
	}
	public int compareTo(Person per)
	{
		if(this.age>per.age)
			return 1;
		else if(this.age<per.age)
			return -1;
		else
			return 0;
			
	
			
	}
}
