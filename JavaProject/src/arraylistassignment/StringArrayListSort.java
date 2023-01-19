package arraylistassignment;
import java.util.ArrayList;
import java.util.Collections;
public class StringArrayListSort {

	void arrayList(ArrayList<String>al)
	{
		al.add("pune");
		al.add("mumbai");
		al.add("nashik");
		al.add("nagpur");
		al.add("ahmednagar");
		
	}
	void sortArrayList(ArrayList<String>al)
	{
		Collections.sort(al);
	/*	for(String s:al)
		{
			System.out.println(s);
		}*/
	}
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		
		StringArrayListSort as=new StringArrayListSort();
		as.arrayList(al);
		as.sortArrayList(al);
		System.out.println(al);
	}
	
}
