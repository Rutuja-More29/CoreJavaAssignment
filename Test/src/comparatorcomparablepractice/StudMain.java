package comparatorcomparablepractice;

import java.util.ArrayList;
import java.util.Collections;

public class StudMain {
	void setArraylist(ArrayList<Stud>al) {
		Stud s1=new Stud();
		s1.setSid(11);
		s1.setSname("Rutuja");
		s1.setDept("Mech");
		s1.setSmarks(90);
		al.add(s1);
		
		Stud s2=new Stud();
		s2.setSid(12);
		s2.setSname(" siya");
		s2.setDept("Comp");
		s2.setSmarks(78);
		al.add(s2);
		
		Stud s3=new Stud();
		s3.setSid(13);
		s3.setSname("priya");
		s3.setDept("It");
		s3.setSmarks(77);
		al.add(s3);
		
	}
	void sortlist(ArrayList<Stud>al) {
		System.out.println("----------------ascending sort-----------------");
		Collections.sort(al);
		System.out.println(al);
		System.out.println("\n---------------descending sort---------------------");
		Collections.reverse(al);
		System.out.println(al);
	}
	void sortByComparator(ArrayList<Stud>al) {
		System.out.println("---------------sort by comparator--------------");
		Collections.sort(al, new DeptStudSort());
		System.out.println(al);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Stud>al=new ArrayList<>();
		
		StudMain sm=new StudMain();
		sm.setArraylist(al);
		sm.sortlist(al);
		sm.sortByComparator(al);
	}

}
