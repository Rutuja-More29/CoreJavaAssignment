package arraylistassignment;
import java.util.ArrayList;
import java.util.Iterator;
public class ReplaceElement {
	void arrayList(ArrayList<Integer> al)
	{
		al.add(20);
		al.add(40);
		al.add(11);
		al.add(34);
		al.add(15);
		al.add(90);
		System.out.println(al);
		al.set(2, 500);
		System.out.println(al);
		
	}

	public static void main(String[] args) {
		ArrayList<Integer>al=new ArrayList<>();
		ReplaceElement re=new ReplaceElement();
		re.arrayList(al);

	}

}
