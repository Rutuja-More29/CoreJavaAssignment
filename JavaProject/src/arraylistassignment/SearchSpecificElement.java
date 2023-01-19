package arraylistassignment;
import java.util.ArrayList;

public class SearchSpecificElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<>();
		al.add("Sunday");
		al.add("Monaday");
		al.add("Tuesday");
		al.add("Thursday");
		al.add("Friday");
		al.add("Saturday");
		al.add("Sunday");
	
		for(String f:al)
		{
			if(f.contains("Monday"))
			{
				System.out.println(f);
			}
		}

	}

}
