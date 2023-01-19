package collections;

import java.util.ArrayList;
import java.util.Iterator;
public class StudentMain {
	void setArray(ArrayList<Student1>s1)
	{
		ArrayList<Student1>st1=new ArrayList<>();
		ArrayList<Student1>st2=new ArrayList<>();
		ArrayList<Student1>st3=new ArrayList<>();
		
		Student1 sd1=new Student1();
		sd1.setId(11);
		sd1.setName("rita");
		sd1.setDept("comp");
		sd1.setMarks(70);
		st1.add(sd1);
		
		Student1 sd2=new Student1();
		sd2.setId(341);
		sd2.setName("saru");
		sd2.setDept("mech");
		sd2.setMarks(60);
		st2.add(sd2);
		
		Student1 sd3=new Student1();
		sd3.setId(123);
		sd3.setName("yash");
		sd3.setDept("civil");
		sd3.setMarks(90);
		st3.add(sd3);
		
		
	}
	void removeMarks(ArrayList<Student1>stud)
	{
		Iterator<Student1>itr=stud.iterator();
		while(itr.hasNext())
		{
			Student1 s=itr.next();
			if(s.getMarks()<=60)
			{
				itr.remove();
			}
		}
		
	}
	

	public static void main(String[] args) {
	ArrayList<Student1> al=new ArrayList<> ();
		
		StudentMain sm=new StudentMain();
		sm.setArray(al);
		System.out.println(al);
		sm.removeMarks(al);
		System.out.println(al);
		
		
		
		

	}

}
