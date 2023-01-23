package arraylistpractice;
import java.util.ArrayList;
public class ArrayListString {
	void setArrayList(ArrayList<String>al)
	{
		al.add("monday");
		al.add("tuesday");
		al.add("wednesday");
		al.add("thursady");
		al.add("friday");
		al.add("saturday");
		al.add("sunday");
		
		for(String s:al)
		{
			if(s.length()>7)
			{
				System.out.println(s);
			}
		}
	}

	public static void main(String[] args) {
		ArrayList<String>al=new ArrayList<>();
		ArrayListString s1=new ArrayListString();
		s1.setArrayList(al);
		

	}

}
