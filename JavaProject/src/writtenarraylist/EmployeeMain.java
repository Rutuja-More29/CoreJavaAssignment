package writtenarraylist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class EmployeeMain {

	void details(LinkedList<Employee> emp1) {
		emp1.add(new Employee(1, "swati", new Dept(101, "ENTC")));
		Dept d1 = new Dept(102, "Computer");
		emp1.add(new Employee(2, "pooja", d1));
		Dept d2 = new Dept(101, "ENTC");
		emp1.add(new Employee(3, "sanchit", d2));
		emp1.add(new Employee(4, "shweta", new Dept(103, "biology")));
		emp1.add(new Employee(5, "rutu", new Dept(104, "commerece")));
	}

	void remove(LinkedList<Employee> emp2) {
		System.out.println("After removing of the elements:");
		Iterator<Employee> eit = emp2.iterator();
		while (eit.hasNext()) {
			Employee e = eit.next();
			if (e.d.did == 101) {
				eit.remove();
			}
		}
		/*
		 * String dept=""; for(Employee e:emp2) { if(e.d.did==101) { dept=e.d.dname; } }
		 * 
		 * ListIterator<Emp> eit=emp2.listIterator(); while(eit.hasNext()) { Employee
		 * e=eit.next(); if(e.d.dname.equalsIgnoreCase(dept)) { eit.remove(); } }
		 */
	}

	public static void main(String[] args) {
		EmployeeMain le = new EmployeeMain();

		LinkedList<Employee> li = new LinkedList<>();
		le.details(li);
		System.out.println(li);

		le.remove(li);
		System.out.println(li);
	}

}
