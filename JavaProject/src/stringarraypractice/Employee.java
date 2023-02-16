package stringarraypractice;

public class Employee {
	int id;
	String name, dept;
	float salary;

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

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String toString() {
		return id + " " + name + " " + dept + " " + salary;
	}
	void hike()
	{
		float incrementalsalary=((salary*10)/100);
		salary=incrementalsalary+salary;
	}
}
