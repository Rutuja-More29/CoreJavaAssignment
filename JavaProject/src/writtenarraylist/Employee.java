package writtenarraylist;

public class Employee {
	int eno;
	String name;
	Dept d;
	Employee(int eno,String name,Dept d)
	{
		this.eno=eno;
		this.name=name;
		this.d=d;
	}
	
	
	public String toString()
	{
		return eno+" "+name+" "+d;
	}

	
	
	
}
