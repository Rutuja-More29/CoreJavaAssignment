package test;

import java.util.HashMap;
import java.util.HashSet;

public class StudentHashSet {
	void createSet(HashSet<Student>hs) {
	hs.add(new Student(111,"Riya",68,new Course(1,"JavaCourse")));
	hs.add(new Student(112,"Sanjay",90,new Course(2,"PythonCourse")));
	hs.add(new Student(113,"Siya",90,new Course(3,"DotNetCourse")));
	hs.add(new Student(114,"Mita",78,new Course(1,"JavaCourse")));
	hs.add(new Student(115,"Riya",60,new Course(3,"ClanguageCourse")));
	
		
		
		
	}
	void createMap(HashSet<Student>hs,HashMap<String,Integer>hm) {
		for(Student st:hs) {
			String c=st.getC().cname;
			int i=st.getC().cid;
			if(hm.containsKey(c)) {
				hm.put(c, i+1);
			}
			else
			{
				hm.put(c, 1);
			}
		}
		System.out.println(hm);
	}
	public static void main(String[] args) {
		HashSet<Student>hs=new HashSet<>();
		HashMap<String,Integer>hm=new HashMap<>();
		StudentHashSet shs=new StudentHashSet();
		shs.createSet(hs);
		shs.createMap(hs, hm);
	}
}
