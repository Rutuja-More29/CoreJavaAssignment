package comparablecomapratorassignment;

public class ArrayListEmployee implements Comparable<ArrayListEmployee> {
	int id,salary;
	String name;
	ArrayListEmployee(int id,String name,int salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public String toString()
	{
		return id+" "+name+" "+salary;
	}
	public int compareTo(ArrayListEmployee e)
	{
		if(this.salary>e.salary)
			return 1;
		else if(this.salary<e.salary)
			return -1;
		else
		{
			return this.name.compareTo(e.name);
			
				
			}
		}
		
	}

