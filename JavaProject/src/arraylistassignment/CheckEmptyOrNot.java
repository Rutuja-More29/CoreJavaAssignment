package arraylistassignment;
import java.util.ArrayList;
public class CheckEmptyOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String>al=new ArrayList<>();
		al.add("English");
		al.add("Marathi");
		al.add("Hindi");
		al.add("German");
		al.add("Japanese");
		
		boolean ans=al.isEmpty();
		if(ans==true)
		{
			System.out.println("ArrayList is empty");
		}
		else
		{
			System.out.println("ArrayList Not Empty");
		}

	}

}
