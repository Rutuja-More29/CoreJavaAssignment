package practicearraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeDepartmentMain {
	void check(ArrayList<Employee>al) {
		Department d=new Department();
		d.setDid(111);
		d.setDname("Dev");
		
		Department d1=new Department();
		d1.setDid(112);
		d1.setDname("test");
		
		Department d2=new Department();
		d1.setDid(113);
		d1.setDname("sales");
		
		Employee e1=new Employee();
		e1.setEid(1);
		e1.setEname("riya");
		e1.setD(d);
		al.add(e1);
		
		Employee e2=new Employee();
		e2.setEid(2);
		e2.setEname("siya");
		e2.setD(d1);
		al.add(e2);
		
		Employee e3=new Employee();
		e3.setEid(23);
		e3.setEname("radha");
		e3.setD(d2);
		al.add(e3);
		
		Employee e4=new Employee();
		e4.setEid(26);
		e4.setEname("rahul");
		e4.setD(d);
		al.add(e4);
		
		Employee e5=new Employee();
		e5.setEid(78);
		e5.setEname("swara");
		e5.setD(d1);
		al.add(e5);
		
		Iterator<Employee>itr=al.iterator();
		while(itr.hasNext()) {
			Employee emp=itr.next();
			if(emp.getD().getDname().equalsIgnoreCase("dev")) {
				System.out.println(emp);
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee>al=new ArrayList<>();
		EmployeeDepartmentMain edm=new EmployeeDepartmentMain();
		edm.check(al);
		

	}

}
