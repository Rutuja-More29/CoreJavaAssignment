package arraylistpractice;
import java.util.ArrayList;
import java.util.Collections;
public class StringArrayListSort {
	void setArrayList(ArrayList<String>al)
	{
		al.add("java");
		al.add("python");
		al.add("c");
		al.add("dotnet");
		
	}
	void sort(ArrayList<String>al)
	{
		Collections.sort(al);
	}

	public static void main(String[] args) {
		ArrayList<String>al=new ArrayList<>();
		StringArrayListSort s=new StringArrayListSort();
		s.setArrayList(al);
		s.sort(al);
		System.out.println(al);

	}

}
