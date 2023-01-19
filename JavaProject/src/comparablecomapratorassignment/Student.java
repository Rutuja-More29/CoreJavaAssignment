package comparablecomapratorassignment;



public class Student  implements Comparable<Student>{
	int id, marks;
	String name, dept;

	Student(int id, String name, String dept, int marks) {
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.marks = marks;
	}

	public String toString() {
		return id + " " + name + " " + dept + " " + marks;
	}
	public int compareTo(Student st)
	{
		/*if(this.marks>st.marks)
			return 1;
		else if(this.marks<st.marks)
			return -1;
		else
			return this.name.compareTo(st.name);
			*/
		if(this.dept.compareTo(st.dept)==0)
		{
			if(this.marks>st.marks)
				return 1;
			else if(this.marks<st.marks)
				return -1;
			else
				return this.name.compareTo(st.name);               
		}
		else 
		{
			if(this.id>st.id)
				return 1;
			else if(this.id<st.id)
				return -1;
			else
				return 0;
		}
		
	}
}
