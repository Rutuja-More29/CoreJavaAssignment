package arraylistcodes;
import java.util.ArrayList;
import java.util.Scanner;
public class PersonAddressMain {
	void setElement(ArrayList<Person>p)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size:");
		int size=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter id,name:");
			int id=sc.nextInt();
			String name=sc.next();
			Address add=new Address();
			System.out.println("Enter city,state,country:");
			String city=sc.next();
			String state=sc.next();
			String country=sc.next();
			add.setCity(city);
			add.setState(state);
			add.setCountry(country);
			
			Person p1=new Person();
			p1.setId(id);
			p1.setName(name);
			p1.setContact(id);
	
			// incomplete
			
		}
	}

	public static void main(String[] args) {
		ArrayList<Person> ap=new ArrayList<>();
		

	}

}
