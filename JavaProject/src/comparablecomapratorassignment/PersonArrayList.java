package comparablecomapratorassignment;
import java.util.ArrayList;
import java.util.Collections;
public class PersonArrayList {
	void setElement(ArrayList<Person>p)
	{
		p.add(new Person(45,"ram",899765433));
		p.add(new Person(40,"sham",899765438));
		p.add(new Person(55,"amay",99765433));
		p.add(new Person(35,"samay",889765430));
		p.add(new Person(29,"vinay",699765435));
		p.add(new Person(30,"kavi",329765433));
		p.add(new Person(23,"rita",899765431));
		
	}
	void sortElement(ArrayList<Person>p)
	{
		Collections.sort(p);
	}

	public static void main(String[] args) {
		ArrayList<Person> ap=new ArrayList<>();
		PersonArrayList alp=new PersonArrayList();
		alp.setElement(ap);
		System.out.println(ap);
		alp.sortElement(ap);
		System.out.println(ap);
		

	}

}
