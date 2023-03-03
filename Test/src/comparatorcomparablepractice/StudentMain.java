package comparatorcomparablepractice;

import java.util.ArrayList;
import java.util.Collections;

public class StudentMain {
	
	void setlist(ArrayList<Student>al) {
		al.add(new Student(23,"sinchan",20));
		al.add(new Student(26,"riya",30));
		al.add(new Student(78,"amay",19));
		al.add(new Student(100,"heer",30));
	}
	void sortlist(ArrayList<Student>al) {
		Collections.sort(al, new StudentNameSort());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student>al=new ArrayList<>();
		StudentMain s=new StudentMain();
		s.setlist(al);
		s.sortlist(al);
		System.out.println(al);

	}

}
