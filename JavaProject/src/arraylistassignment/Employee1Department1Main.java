package arraylistassignment;

import java.util.ArrayList;

public class Employee1Department1Main {
	void setArrayList(ArrayList<Employee1>al)
	{
		al.add(new Employee1(111,"rita",45000,new Department1(103,"dev")));
		al.add(new Employee1(657,"kavya",40000,new Department1(193,"test")));
		al.add(new Employee1(899,"sanvi",55000,new Department1(100,"sales")));
		al.add(new Employee1(1,"aarvi",50000,new Department1(109,"dev")));
	}

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		
	}

}
