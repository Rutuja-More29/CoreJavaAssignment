package treemap;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
public class StudentSortOnValueMain {
	void set(TreeMap<Integer,Student>tm)
	{
		tm.put(192,new Student("rita","ruta@gmail.com",80) );
		tm.put(101, new Student("seema","seema@gmail.com",60));
		tm.put(120, new Student("harsha","harsha@gmail.com",50));
		tm.put(115, new Student("siddhart","siddhart@gmail.com",60));
		tm.put(178, new Student("ganesh","ganesh@gmail.com",45));
	}
	void sort(TreeMap<Integer,Student>tm)
	{
		ArrayList<Student> al=new ArrayList<>();
		for(Student s:al)
		{
			al.add(s);
		}
		//Collections.sort(al,new StudentNameSortComparator());
		System.out.println(al);
		LinkedHashMap<Integer,Student> lhm= new LinkedHashMap<>();
		for(Student s:al)
		{
			int key=0;
			for(Map.Entry<Integer, Student> ent:tm.entrySet())
			{
				if(s.name.equalsIgnoreCase(ent.getValue().name))
				{
					key=ent.getKey();
					if(!lhm.containsKey(key))
					{
						lhm.put(key, s);
					}
				}
			}
			System.out.println(lhm);
		}
	}

	public static void main(String[] args) {
		TreeMap<Integer,Student> tm=new TreeMap<>();
		StudentSortOnValueMain sm=new StudentSortOnValueMain();
		sm.set(tm);
		sm.sort(tm);
		System.out.println(tm);
		

	}

}
