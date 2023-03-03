package arraylistpractice;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeDepartmentMain {
	void setArraylist(ArrayList<Employee>al) {
		Department d=new Department();
		d.setDid(11);
		d.setDname("dev");
		
		Department d1=new Department();
		d.setDid(12);
		d.setDname("test");
		
		Department d2=new Department();
		d2.setDid(13);
		d2.setDname("sales");
		
		Employee e1=new Employee();
		e1.setEid(111);
		e1.setName("radha");
		e1.setSalary(50000);
		e1.setD(d);
		al.add(e1);
		
		Employee e2=new Employee();
		e2.setEid(222);
		e2.setName("sneha");
		e2.setSalary(78000);
		e2.setD(d1);
		al.add(e2);
		
		Employee e3=new Employee();
		e3.setEid(333);
		e3.setName("karan");
		e3.setSalary(89000);
		e3.setD(d2);
		al.add(e3);
		
		Employee e4=new Employee();
		e4.setEid(333);
		e4.setName("kiara");
		e4.setSalary(89000);
		e4.setD(d2);
		al.add(e4);
		
		Iterator<Employee>itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

	public static void main(String[] args) {
		ArrayList<Employee>al=new ArrayList<>();
		EmployeeDepartmentMain e=new EmployeeDepartmentMain();
		e.setArraylist(al);

	}

}
