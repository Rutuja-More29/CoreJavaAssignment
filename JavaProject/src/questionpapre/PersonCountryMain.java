package questionpapre;

public class PersonCountryMain {

	public static void main(String[] args) {
		Country c = new Country(1, "USA");
		Person p = new Person(11, "jay", c);
		Person pc = p.deepCopy();
		System.out.println(pc);
	}

}
