package arraylistassignment;

public class Emp implements Comparable<Emp> {
	int id,salary;
	String name;
	Emp(int id,String name,int salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public String toString()
	{
		return id+" "+name+" "+salary;
	}
	public int compareTo(Emp em1)
	{
		return this.name.compareTo(em1.name);
	}
}
