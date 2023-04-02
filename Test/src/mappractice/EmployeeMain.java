package mappractice;

import java.util.ArrayList;
import java.util.HashMap;

public class EmployeeMain {
	void createList(ArrayList<Employee>al) {
		Employee e1=new Employee();
		e1.setEid(11);
		e1.setName("rita");
		e1.setDept("dev");
		e1.setSalary(45000);
		al.add(e1);
		
		Employee e2=new Employee();
		e2.setEid(24);
		e2.setName("sneha");
		e2.setDept("test");
		e2.setSalary(45000);
		al.add(e2);
		
		Employee e3=new Employee();
		e3.setEid(65);
		e3.setName("nilla");
		e3.setDept("dev");
		e3.setSalary(56000);
		al.add(e3);
	}
	void createMap(ArrayList<Employee>al,HashMap<String,Integer>hm) {
		for(Employee emp:al) {
			String s=emp.getName();
			int i=emp.getSalary();
			if(hm.containsKey(s)) {
				hm.put(s, i+1);
			}else
			{
				hm.put(s, 1);
			}
		}
		System.out.println(hm);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee>al=new ArrayList<>();
		HashMap<String,Integer>hm=new HashMap<>();
		EmployeeMain em=new EmployeeMain();
		em.createList(al);
		em.createMap(al, hm);
		

	}

}
