package comparatorcomparablepractice;

public class Employees  {
	int id,salary;
	String name,dept;
	Profile p;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
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
	
	public Profile getP() {
		return p;
	}
	public void setP(Profile p) {
		this.p = p;
	}
	public String toString() {
		return id+" "+name+" "+salary+" "+dept+" "+p;
	}
	
}
