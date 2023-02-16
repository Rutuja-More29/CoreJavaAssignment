package collectionpractice;

public class Employee implements Comparable<Employee> {
	int id;
	String name,dept;
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
		return id+" "+name+" "+dept;
	}
	@Override
	public int compareTo(Employee o) {
		if(this.id>o.id)
			return 1;
		else if(this.id<o.id)
			return -1;
		else
			return 0;
		
	}
}
