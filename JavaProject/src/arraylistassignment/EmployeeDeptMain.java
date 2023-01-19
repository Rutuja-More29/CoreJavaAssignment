package arraylistassignment;

import java.util.ArrayList;
import java.util.Iterator;
public class EmployeeDeptMain {

	void arrayList(ArrayList<Employee> ael) {
		Department d1 = new Department();
		d1.setDid(111);
		d1.setDname("dev");

		Employee e1 = new Employee();
		e1.setEmpid(342);
		e1.setEname("tina");
		e1.setD(d1);
		ael.add(e1);
		
		Department d2=new Department();
		d2.setDid(121);
		d2.setDname("test");
		
		Employee e2=new Employee();
		e2.setEmpid(1237);
		e2.setEname("santa");
		e2.setD(d2);
		ael.add(e2);

	}
	void itrateArrayList(ArrayList<Employee>ael)
	{
		Iterator<Employee> em=ael.iterator();
		while(em.hasNext())
		{
			System.out.println(em.next());
		}
	}

	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<>();
		EmployeeDeptMain edm=new EmployeeDeptMain();
		edm.arrayList(al);
		//System.out.println(al);
		edm.itrateArrayList(al);
		System.out.println(al);
		
	}

}
