package com.containment;

public class EmployeeDeptMydateMain {

	public static void main(String[] args) {
		Dept d=new Dept();
		d.setDept_id(111);
		d.setDept_name("comp");
		
		Mydate m=new Mydate();
		m.setDay("Thursday");
		m.setMonth("November");
		m.setYear(2022);
		
		Employee e=new Employee();
		e.setId(201);
		e.setName("pqrs");
		e.setSalary(45000);
		e.setD(d);
		e.setM(m);
		
		System.out.println(e);

	}

}
