package monthlytest;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetStudent {

	void createSet(HashSet<Student>student) {
		Student s=new Student();
		s.setStudid(11);
		s.setName("Radha");
		s.setQualification("BE comp");
		s.setYearOfPassing(2022);
		s.setPlaced(true);
		student.add(s);
		
		Student s1=new Student();
		s1.setStudid(12);
		s1.setName("rita");
		s1.setQualification("BE It");
		s1.setYearOfPassing(2020);
		s1.setPlaced(false);
		student.add(s1);
		
		Student s2=new Student();
		s2.setStudid(13);
		s2.setName("sunil");
		s2.setQualification("BCS");
		s2.setYearOfPassing(2022);
		s2.setPlaced(true);
		student.add(s2);
		
		Student s3=new Student();
		s3.setStudid(14);
		s3.setName("heer");
		s3.setQualification("mtech");
		s3.setYearOfPassing(2021);
		s3.setPlaced(true);
		student.add(s3);
		
		ArrayList<Student>placedstud=new ArrayList<>();
		ArrayList<Student>unplacedstud=new ArrayList<>();
		for(Student st:student) {
			if(st.isPlaced()) {
				placedstud.add(st);
			}
			else
			{
				unplacedstud.add(st);
			}
		}
		System.out.println("placed student..");
		for(Student st:placedstud) {
			System.out.println(s);
		}
		System.out.println("unplaced studen...");
		for(Student st:unplacedstud) {
			System.out.println(st);
		}
		
	}
	public static void main(String[] args) {
		HashSet<Student>student=new HashSet<>();
		HashSetStudent hs=new HashSetStudent();
		hs.createSet(student);
		

	}

}
