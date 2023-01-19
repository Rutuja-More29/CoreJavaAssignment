package arraylistassignment;
import java.util.ArrayList;
public class RetrieveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<>();
		al.add("orange");
		al.add("Mango");
		al.add("Apple");
		al.add("papaya");
		al.add("coconut");
		System.out.println(al);
		//Retrieve the first element
		 String s=al.get(0);
		System.out.println("first element:"+s);

	}

}
