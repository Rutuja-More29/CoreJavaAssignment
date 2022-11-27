package com.encapsulation;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee e=new Employee();
		e.setId(101);
		e.setName("abcd");
		e.setDept("dev");
		e.setSalary(45000);
		System.out.println(e.getId()+" "+e.getName()+" "+e.getDept()+" "+e.getSalary());
		

	}

}
