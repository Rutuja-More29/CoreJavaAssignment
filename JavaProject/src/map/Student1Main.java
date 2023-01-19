package map;
import java.util.HashMap;
import java.util.Map;
public class Student1Main {
	void setMap(HashMap<Integer,Student1>stud)
	{
		stud.put(112,new Student1("rita","rita@gmail.com",70));
		stud.put(345, new Student1("sita","sita@gmail.com",80));
		stud.put(678, new Student1("nayan","nayan@gmail.com",80));
		stud.put(681, new Student1("sona","sona@gmail.com",79));
		stud.put(110,new Student1("radha","radha@gmail.com",70));
		stud.put(305, new Student1("gita","gita@gmail.com",80));
		stud.put(670, new Student1("ayan","ayan@gmail.com",80));
		stud.put(601, new Student1("mona","mona@gmail.com",79));
		
	}
	void display(HashMap<Integer,Student1> stud)
	{
		for(Map.Entry<Integer, Student1> ent:stud.entrySet())
		{
			//if(ent.getValue().marks==70)
			if(ent.getValue().name.startsWith("r"))
			System.out.println(ent.getKey()+" "+ent.getValue());
		}
	}
	

	public static void main(String[] args) {
		HashMap<Integer,Student1> hm=new HashMap<>();
		Student1Main s1 =new Student1Main();
		s1.setMap(hm);
		s1.display(hm);
	}

}
