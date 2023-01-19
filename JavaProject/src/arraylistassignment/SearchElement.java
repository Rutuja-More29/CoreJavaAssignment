package arraylistassignment;
import java.util.ArrayList;
public class SearchElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> name=new ArrayList<>();
		name.add("Rachit");
		name.add("sham");
		name.add("ram");
		name.add("riya");
		name.add("kavya");
		name.add("spruha");
		name.add("rita");
		
		for(String s:name)
		{
			if(s.contains("r"))
				System.out.println(s);
		}

	}

}
