package treemap;
import java.util.TreeMap;
public class PersonTreemap {
		void setElement(TreeMap<Person,Integer> tm)
		{
			tm.put(new Person(12,"siya","siya@gmail.com","pune"), 30);
			tm.put(new Person(1,"radha","radha@gmail.com","nashik"), 30);
			tm.put(new Person(60,"janvi","janvi@gmail.com","mumbai"), 40);
			tm.put(new Person(89,"sanvi","sanvi@gmail.com","pune"), 33);
			tm.put(new Person(34,"aanvi","aanvi@gmail.com","ahmednagar"), 30);
		}
	public static void main(String[] args) {
	//	TreeMap<Person,Integer>tm=new TreeMap<>();
		TreeMap<Person,Integer>tm=new TreeMap<>(new PersonNameSort());    // use comparator sort by name
		PersonTreemap ptm=new PersonTreemap();
		ptm.setElement(tm);
		System.out.println(tm);
		

	}

}
