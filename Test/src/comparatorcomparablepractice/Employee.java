package comparatorcomparablepractice;

public class Employee  implements Comparable<Employee>{
	int age;
	String name, designation;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String toString() {
		return name + " " + designation + " " + age;
	}
	public int compareTo(Employee e) {
		/*if(this.age>e.age)
			return 1;
		else if(this.age<e.age)
			return -1;
		else
			return 0;
			*/
		// descending sort
	/*	if(this.age>e.age)
			return -1;
		else if(this.age<e.age)
			return 1;
		else
			return 0;
			
		*/
	//	sort by name
		return this.name.compareToIgnoreCase(e.getName());
		
	
		
		
	}
}
