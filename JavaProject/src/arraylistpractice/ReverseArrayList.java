package arraylistpractice;
import java.util.ArrayList;
import java.util.Collections;
public class ReverseArrayList {
	void setArrayList(ArrayList<String>al)
	{
		al.add("Pink");
		al.add("green");
		al.add("yellow");
		al.add("blue");
		al.add("grey");
		al.add("voilet");

	}
	void sortArrayList(ArrayList<String>al)
	{
		Collections.sort(al);
		Collections.reverse(al);
	}
	public static void main(String[] args) {
		ArrayList<String>al=new ArrayList<>();
		ReverseArrayList ral=new ReverseArrayList();
		ral.setArrayList(al);
		ral.sortArrayList(al);
		System.out.println(al);

	}

}
