package comparatorcomparablepractice;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeMain {
	void setArraylist(ArrayList<Employee>al) {
		Employee e=new Employee();
		e.setName("abhi");
		e.setDesignation("test");
		e.setAge(30);
		al.add(e);
		
		Employee e1=new Employee();
		e1.setName("rita");
		e1.setDesignation("accountant");
		e1.setAge(45);
		al.add(e1);
		
		Employee e2=new Employee();
		e2.setName("nayan");
		e2.setDesignation("sales");
		e2.setAge(50);
		al.add(e2);
		
		Employee e3=new Employee();
		e3.setName("amay");
		e3.setDesignation("finance");
		e3.setAge(35);
		al.add(e3);
	}
	void sortlist(ArrayList<Employee>al) {
		Collections.sort(al);
	}

	public static void main(String[] args) {
		ArrayList<Employee>al=new ArrayList<>();
		
		EmployeeMain em=new EmployeeMain();
		em.setArraylist(al);
		em.sortlist(al);
		System.out.println(al);
	}

}
