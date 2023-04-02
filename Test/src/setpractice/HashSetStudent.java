package setpractice;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetStudent {

		void set(HashSet<Student>hs) {
		Student s=new Student();
		s.setSid(111);
		s.setSname("rutuja");
		s.setMarks(89);
		s.setDept("mech");
		hs.add(s);
		
		Student s1=new Student();
		s1.setSid(123);
		s1.setSname("shubham");
		s1.setMarks(78);
		s1.setDept("mech");
		hs.add(s1);
		
		Student s2=new Student();
		s2.setSid(232);
		s2.setSname("rita");
		s2.setMarks(567);
		s2.setDept("It");
		hs.add(s2);
		
		
		}
		void updateRecord(HashSet<Student>hs) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter id dept:");
			int id=sc.nextInt();
			String dept=sc.next();
			for(Student st:hs) {
				if(st.getSid()==id) {
					st.setDept(dept);
				}
			}
			System.out.println(hs);
		}
		void updateMarks(HashSet<Student>hs) {
			for(Student st:hs) {
				st.setMarks(st.getMarks()+2) ;
					
				
			}
			System.out.println(hs);
		}
	public static void main(String[] args) {
	HashSet<Student>hs=new HashSet<>();
	HashSetStudent hss=new HashSetStudent();
	hss.set(hs);
	//hss.updateRecord(hs);
	hss.updateMarks(hs);
	

	}

}
