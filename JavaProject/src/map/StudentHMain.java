package map;

import java.util.LinkedHashMap;

public class StudentHMain {
	void setElement(LinkedHashMap<StudentH,Integer> stud1)
	{
		stud1.put(new StudentH(112,"rahul","mech",70), 21);
		stud1.put(new StudentH(100,"ajay","comp",80), 20);
		stud1.put(new StudentH(222,"rina","civil",70), 22);
		stud1.put(new StudentH(56,"nita","ec",90), 21);
		stud1.put(new StudentH(90,"sita","mech",60), 23);
		stud1.put(new StudentH(1,"prita","ec",90), 21);
		stud1.put(new StudentH(112,"gita","mech",60), 23);
	}

	public static void main(String[] args) {
	LinkedHashMap<StudentH,Integer> stud=new LinkedHashMap<>();
	StudentHMain s=new StudentHMain();
	s.setElement(stud);
	System.out.println(stud);
	
	

	}

}
