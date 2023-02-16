package collectionpractice;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeMain {
	void setlist(ArrayList<Employee>al)
	{
		Employee e1=new Employee();
		Employee e2=new Employee();
		Employee e3=new Employee();
		e1.setId(11);
		e1.setName("rutuja");
		e1.setDept("dev");
		al.add(e1);
		
		e2.setId(12);
		e2.setName("shubham");
		e2.setDept("dev");
		al.add(e2);
		
		e3.setId(13);
		e3.setName("harsha");
		e3.setDept("sales");
		al.add(e3);
		
	}
	void sortlist(ArrayList<Employee>al)
	{
		Collections.sort(al);
		//Collections.reverse(al);
	}

	public static void main(String[] args) {
		ArrayList<Employee>al=new ArrayList<>();
		EmployeeMain em=new EmployeeMain();
		em.setlist(al);
		em.sortlist(al);
		System.out.println(al);
		

	}

}
