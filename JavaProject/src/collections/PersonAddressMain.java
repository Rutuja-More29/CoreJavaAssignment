package collections;
import java.util.ArrayList;
import java.util.ListIterator;
public class PersonAddressMain {
	ArrayList<Person> element(ArrayList<Person>al1)
	{
		ArrayList<Person> al=new ArrayList<>();
		al1.add(new Person(101,"sanjay",97856342,new Address("pune","maharastra","india")));
		al1.add(new Person(102,"jay",97856342,new Address("nashik","maharastra","india")));
		al1.add(new Person(103,"ajay",97800342,new Address("mumbai","maharastra","india")));
		al1.add(new Person(104,"veer",97857342,new Address("pune","maharastra","india")));
		al1.add(new Person(105,"mira",98877342,new Address("mumbai","maharastra","india")));
		al1.add(new Person(106,"mahir",99856342,new Address("pune","maharastra","india")));
		al1.add(new Person(107,"sachit",95856342,new Address("nashik","maharastra","india")));
		return al1;
		
	}
	void displayCityWise(ArrayList<Person>per)
	{
		for(Person p:per)
		{
			if(p.add.city.equalsIgnoreCase("pune"))
				System.out.println(p.name+" "+p.contact);
		}
	}
	void removePerson(ArrayList<Person>per)
	{
		ListIterator<Person>litr=per.listIterator();
		while(litr.hasNext())
		{
			Person p=litr.next();
			if(p.add.city.equalsIgnoreCase("mumbai"))
			{
				litr.remove();
			}
			
		}
	}
	public static void main(String[] args) {
		ArrayList<Person> al=new ArrayList<>();
		PersonAddressMain pa=new PersonAddressMain();
	al=	pa.element(al);
		System.out.println(al);
		pa.displayCityWise(al);
		System.out.println(al);
		pa.removePerson(al);
		System.out.println(al);
		
		
	}

}
