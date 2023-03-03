package comparatorcomparablepractice;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeesMain {
	void setlist(ArrayList<Employees>al) {
		Profile p1=new Profile();
		p1.setState("maharastra");
		p1.setCountry("india");
		
		Profile p2=new Profile();
		p2.setState("banglore");
		p2.setCountry("karnataka");
		
		Profile p3=new Profile();
		p3.setState("chhatisgad");
		p3.setState("up");
		
		Employees emp=new Employees();
		emp.setId(11);
		emp.setName("vrishali");
		emp.setDept("data");
		emp.setSalary(56000);
		emp.setP(p1);
		al.add(emp);
		
		Employees emp1=new Employees();
		emp1.setId(113);
		emp1.setName("rishali");
		emp1.setDept("dev");
		emp1.setSalary(6000);
		emp1.setP(p2);
		al.add(emp1);
		
		Employees emp2=new Employees();
		emp2.setId(11);
		emp2.setName("mohini");
		emp2.setDept("test");
		emp2.setSalary(56000);
		emp2.setP(p2);
		al.add(emp2);
		
		Employees emp3=new Employees();
		emp3.setId(101);
		emp3.setName("samay");
		emp3.setDept("sales");
		emp3.setSalary(60000);
		emp3.setP(p3);
		al.add(emp3);
	}
	void sortlist(ArrayList<Employees>al) {
		Collections.sort(al, new CountryNameSort());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employees>al=new ArrayList<Employees>();
		EmployeesMain em11=new EmployeesMain();
		em11.setlist(al);
		em11.sortlist(al);
		System.out.println(al);
	}

}
