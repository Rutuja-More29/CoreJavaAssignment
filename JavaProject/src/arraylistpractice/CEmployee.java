package arraylistpractice;

public class CEmployee implements Comparable<CEmployee> {
	int id,salary;
	String name, dept;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	public String toString()
	{
		return id+" "+name+" "+dept+" "+salary;
	}
	public void setSalary(int salary)
	{
		this.salary=salary;
	}
	public int getSalary()
	{
		return salary;
	}
	public int compareTo(CEmployee e)
	{
	//	return this.getName().compareToIgnoreCase(e.getName());
		
		if(this.getSalary()>e.getSalary())
			return 1;
		else if(this.getSalary()<e.getSalary())
			return -1;
		else
		{
			
				return 0;
		}
		
	}
}
