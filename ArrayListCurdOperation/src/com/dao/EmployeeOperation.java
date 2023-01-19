package com.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.pojo.Employee;

public class EmployeeOperation {
	
	Scanner sc = new Scanner(System.in);
	
	public void employeeSetData(ArrayList<Employee> emp) {
		
		System.out.println("Enter no.of Employee :");
		int size = sc.nextInt();
		for (int i = 0; i < size; i++) {
			System.out.println("Enter Employee id,name dept,salary:");
			int id = sc.nextInt();
			String name = sc.next();
			String dept = sc.next();
			int salary = sc.nextInt();

			Employee e = new Employee();
			e.setId(id);
			e.setName(name);
			e.setDept(dept);
			e.setSalary(salary);
			emp.add(e);
		}
	}
	public void addEmployee(ArrayList<Employee>emp)
	{
		System.out.println("Enter Employee id,name dept,salary:");
		int id = sc.nextInt();
		String name = sc.next();
		String dept = sc.next();
		int salary = sc.nextInt();

		Employee e = new Employee();
		e.setId(id);
		e.setName(name);
		e.setDept(dept);
		e.setSalary(salary);
		emp.add(e);
	}

	public void displayData(ArrayList<Employee> emp) {
		for (Employee ee : emp) {
			System.out.println(ee);
		}
	}

	public void removeEmployee(ArrayList<Employee> emp) {
		Iterator<Employee> itr = emp.iterator();
		while (itr.hasNext()) {
			Employee em = itr.next();
			if (em.getId() == 101) {
				itr.remove();
			}
			
		}
		System.out.println(emp);
	}
	public void updateData(ArrayList<Employee> emp)
	{
		System.out.println("Enter Employee id,newSalary:");
		int id = sc.nextInt();
		int salary = sc.nextInt();
		for (Employee e : emp) {
			if (e != null) {
				if (e.getId() == id) {
					e.setSalary(salary);
				}
			}
		}
	}
	

}
