package crudoperation;

import java.util.Arrays;
import java.util.Scanner;

public class EmployeeMain {
	 Employee emp[]=new Employee[5];
	 
	 
	 
	  
	  void insertData()
	  {
		 
		  
			  Employee e1=new Employee();
			  e1.setId(1);
			  e1.setName("abcd");
			  e1.setDept("it");
			  e1.setSalary(55000);
			  emp[0]=e1;
			  
			  Employee e2=new Employee();
			  e2.setId(2);
			  e2.setName("aaa");
			  e2.setDept("comp");
			  e2.setSalary(58000);
			  emp[1]=e2;
			  
			  Employee e3=new Employee();
			  e3.setId(3);
			  e3.setName("bbbb");
			  e3.setDept("mech");
			  e3.setSalary(50000);
			  emp[2]=e3;
			  
			  Employee e4=new Employee();
			  e4.setId(4);
			  e4.setName("ccc");
			  e4.setDept("civil");
			  e4.setSalary(40000);
			  emp[3]=e4;
			 
			  Employee e5=new Employee();
			  e5.setId(5);
			  e5.setName("abab");
			  e5.setDept("ec");
			  e5.setSalary(59000);
			  emp[4]=e5;
	  }
	  void viewData()
	  {
		  System.out.println("Employee data");
		  for(Employee e:emp)
		  {
			  System.out.println("Employee id"+e.getId());
			  System.out.println("Employee name:"+e.getName());
			  System.out.println("Employee dept:"+e.getDept());
			  System.out.println("Employee salary:"+e.getSalary());
		  }
		  System.out.println();
	  }
	  
	  void viewSpecificData()
	  {
		  System.out.println("Specific data:");
		  int id=3;
		  for(Employee e:emp)
		  {
			  if(id==e.getId())
			  {
				  System.out.println(e.getId()+" "+e.getName()+" "+e.getDept()+" "+e.getSalary());
			  }
			  System.out.println();
		  }
	  }
	  void updatData()
	  {
		  int id=4;
		  for(Employee e:emp)
		  {
			  if(id==e.getId() )
			  {
				  float hike=e.getSalary()*0.10f;
				  float newSalary=(e.getSalary())+hike;
			  e.setSalary(newSalary);
			  }
		  }
	  }
	  void deleteData()
	  {
		  System.out.println("Delete data:");
		  int id=2;
		  for(Employee e:emp)
		  {
			  if(id!=e.getId())
			  {
				  System.out.println(e.getId()+" "+e.getName()+" "+e.getDept()+" "+e.getSalary());
			  }
		  }
	  }
	  
	
	public static void main(String[] args) {
	EmployeeMain emp1=new EmployeeMain();
	
	emp1.insertData();
	
	emp1.viewSpecificData();
	emp1.updatData();
	emp1.deleteData();
	emp1.viewData();
	}

}
