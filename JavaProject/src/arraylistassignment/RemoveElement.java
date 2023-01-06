package arraylistassignment;
import java.util.ArrayList;
public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ArrayList<String>al=new ArrayList<>();
			al.add("Monday");
			al.add("Tuesday");
			al.add("Wednesday");
			al.add("Thursday");
			al.add("Friday");
			al.add("Saturday");
			al.add("Sunday");
			System.out.println("original:"+al);
			al.remove(2);
			System.out.println(al);
	}

}
