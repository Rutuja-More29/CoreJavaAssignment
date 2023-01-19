package com.test;

import java.util.ArrayList;
import java.util.Scanner;

import com.dao.EmployeeOperation;
import com.pojo.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
	
		ArrayList<Employee> emp=new ArrayList<>();
		EmployeeOperation eop=new EmployeeOperation();
		Scanner sc=new Scanner(System.in);
		String text=" ";
		do {
			System.out.println("press 1 for insert data");
			System.out.println("press 2 for add data");
			System.out.println("press 3 for display data");
			System.out.println("press 4 for remove data");
			System.out.println("press 5 for update data");
			
			System.out.println("Enter your choice:");
			int choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println(" Employee set data");
				eop.employeeSetData(emp);
				break;
			case 2:
				System.out.println("Employee add data");
				eop.addEmployee(emp);
				break;
			case 3:
				System.out.println("display data");
				eop.displayData(emp);
				break;
			case 4:
				System.out.println("remove data");
				eop.removeEmployee(emp);
				break;
			case 5:
				System.out.println("update data");
				eop.updateData(emp);
				
			default:
				System.out.println("wrong choice");
			}
			System.out.println("Do you want to continue? y/n");
			text=sc.next();
		}while(text.equalsIgnoreCase("y"));
		
		
		
	}

}
