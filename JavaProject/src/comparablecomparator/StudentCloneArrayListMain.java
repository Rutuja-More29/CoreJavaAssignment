package comparablecomparator;

import java.util.ArrayList;

public class StudentCloneArrayListMain {
	

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<>();
		al.add(50);
		al.add(80);
		al.add(90);
		
		Student s1=new Student("Ram",al);
		Student s2=(Student) s1.clone();   //  Shallow copy
		System.out.println(s1);     
		System.out.println(s2);
		
		s2.marks.add(100);
		s2.marks.add(500);
		
		System.out.println("----After altering----");
		System.out.println("s1:"+s1);
		System.out.println("s2:"+s2);

	}

}
