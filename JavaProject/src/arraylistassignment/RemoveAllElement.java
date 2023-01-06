package arraylistassignment;
import java.util.ArrayList;
public class RemoveAllElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>al=new ArrayList<>();
		al.add("Rainy");
		al.add("Winter");
		al.add("Summer");
		System.out.println("original:"+al);
		al.removeAll(al);
		System.out.println(al);

	}

}
