package arraylistcodes;

public class Employee {
	int id;
	String name;
	Department d;
	Employee(int id,String name,Department d)
	{
		this.id=id;
		this.name=name;
		this.d=d;
	}
	public String toString()
	{
		return id+" "+name+" "+d;
	}
}
