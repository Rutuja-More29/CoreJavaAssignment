package comparablecomparator;

import java.util.Comparator;

public class Faculty  implements Comparator<Faculty> {

	int id,salary;
	String name,subject,dept;
	Faculty(int id,String name,String subject,String dept,int salary)
	{
		this.id=id;
		this.name=name;
		this.subject=subject;
		this.dept=dept;
		this.salary=salary;
	}
	public String toString()
	{
		return id+" "+name+" "+subject+" "+dept+" "+salary;
	}
	@Override
	public int compare(Faculty o1, Faculty o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	}

