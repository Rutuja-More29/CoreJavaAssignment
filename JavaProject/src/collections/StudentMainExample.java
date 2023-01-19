package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentMainExample {


	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<StudentExample> s = new ArrayList(2);

		System.out.println("Enter the no of Sudents:");
		int size = sc.nextInt();
		for (int i = 0; i < size; i++) {
			System.out.println("Enter id,name,department:");
			int id = sc.nextInt();
			String name = sc.next();
			String dept = sc.next();
			StudentExample s1 = new StudentExample();

			System.out.println("Enter 5 subject marks:");
			int m1 = sc.nextInt();
			int m2 = sc.nextInt();
			int m3 = sc.nextInt();
			int m4 = sc.nextInt();
			int m5 = sc.nextInt();

			ArrayList<Integer> marks = new ArrayList(5);
			marks.add(m1);
			marks.add(m2);
			marks.add(m3);
			marks.add(m4);
			marks.add(m5);

			int sum = m1 + m2 + m3 + m4 + m5;
			float percent = sum / marks.size();

			s1.setId(id);
			s1.setName(name);
			s1.setDept(dept);
			s1.setMarks(marks);
			s1.setPercentage(percent);
			s.add(s1);

		}

		for (StudentExample st : s) {
			System.out.println(st);
			System.out.println(st.getName() + " " + st.getDept() + " " + st.getPercentage() + " ");
		}

	}

}
