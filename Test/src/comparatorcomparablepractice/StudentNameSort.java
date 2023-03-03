package comparatorcomparablepractice;

import java.util.Comparator;

public class StudentNameSort implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		
		return s1.name.compareToIgnoreCase(s2.name);
	}

}
