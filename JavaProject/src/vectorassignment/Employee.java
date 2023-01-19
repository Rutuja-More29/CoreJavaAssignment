package vectorassignment;

public class Employee {
	int salary;
	String name,dept;
	Employee(String name,String dept,int salary)
	{
		this.name=name;
		this.dept=dept;
		this.salary=salary;
	}
	public String toString()
	{
		return name+" "+dept+" "+salary;
	}
}
