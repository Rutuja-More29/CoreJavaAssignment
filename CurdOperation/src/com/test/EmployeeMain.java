package com.test;

import com.dao.*;

public class EmployeeMain {

	public static void main(String[] args) {
		EmployeeMain em = new EmployeeMain();
		EmployeeOperation eop = new EmployeeOperation();

		eop.EmployeeData();
		eop.addEmployee();
		eop.displyaEmployee();
		eop.updateSalary();
		eop.deleteEmployee();
		eop.displyaEmployee();

	}

}
