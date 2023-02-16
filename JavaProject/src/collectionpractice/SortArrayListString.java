package collectionpractice;
import java.util.ArrayList;
import java.util.Collections;
public class SortArrayListString {
	void createArrayList(ArrayList<String>al)
	{
		al.add("shubham");
		al.add("rutuja");
		al.add("harsha");
		al.add("reema");
		al.add("pallvi");
	}
	void sortList(ArrayList<String>al)
	{
		Collections.sort(al);
	}

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		SortArrayListString s=new SortArrayListString();
		s.createArrayList(al);
		s.sortList(al);
		System.out.println(al);
		

	}

}
