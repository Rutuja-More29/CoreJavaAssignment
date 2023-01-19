package collections;

import java.util.ArrayList;

public class ArrayListStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> stud = new ArrayList<>();
		stud.add(new Student(101, "Abab", "comp", 70));
		stud.add(new Student(102, "aaaa", "entc", 80));
		stud.add(new Student(103, "abcd", "mech", 90));
		stud.add(new Student(104, "pqrs", "civil", 60));
		stud.add(new Student(105, "rrrr", "ele", 50));
		stud.add(new Student(106, "aabb", "comp", 60));
		for (Student s : stud) {
			/*if (s.dept.equalsIgnoreCase("comp"))
				System.out.println(s);*/
			if(s.name.startsWith("A") ||s.name.startsWith("a"))
				System.out.println(s);

		}

	}

}
