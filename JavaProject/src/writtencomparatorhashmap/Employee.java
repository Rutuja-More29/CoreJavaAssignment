package writtencomparatorhashmap;

public class Employee implements Comparable<Employee>{
	int id,salary;
	String name,dept;
	Profile p;
	Employee(int id,String name,String dept,int salary,Profile p)
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.salary=salary;
		this.p=p;
		
	}
	public String toString()
	{
		return id+" "+name+" "+dept+" "+salary+" "+p;
	}
	public int compareTo(Employee e)
	{
		if( this.name.compareTo(e.name)==0)
		{
		if(this.id>e.id)
			return 1;
		else if(this.id<e.id)
			return -1;
		else
			return 0;
		}
		else
			return this.name.compareTo(e.name);
	}
}
