package comparablecomapratorassignment;

public class Employee implements Comparable<Employee> {
	String name,designation;
	int age,id;
	Employee(int id,String name,String designation,int age)
	{
		this.id=id;
		this.name=name;
		this.designation=designation;
		this.age=age;
	}
	public String toString()
	{
		return id+" "+ name+" "+designation+" "+age;
	}
	public int compareTo(Employee e)
	{
	/*	if(this.id>e.id)
			return 1;
		else if(this.id<e.id)
			return -1;
		else
			return 0;*/
		if(this.id>e.id)
			return -1;
		else if(this.id<e.id)
			return 1;
		else
			return 0;
	}
	
}
