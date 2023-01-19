package map;

public class Employee1 {
	int id,salary;
	String name,dept;
	Address a;
	Employee1(int id,String name,String dept,int salary,Address a)
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.salary=salary;
		this.a=a;
		
	}
	public String toString()
	{
		return id+" "+name+" "+dept+" "+salary+a;
	}
}
