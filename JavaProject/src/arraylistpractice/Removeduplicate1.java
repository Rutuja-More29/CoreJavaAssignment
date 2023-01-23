package arraylistpractice;
import java.util.ArrayList;
public class Removeduplicate1 {
	void remove(ArrayList<String>al)
	{
		al.add("mon");
		al.add("tue");
		al.add("wed");
		al.add("tue");
		al.add("mon");
		al.add("wed");
		ArrayList<String>al1=new ArrayList<>();
		for(String s:al)
		{
			if(!al1.contains(s))
			al1.add(s);
		}
		System.out.println(al1);
	}

	public static void main(String[] args) {
	ArrayList<String>al=new ArrayList<>();
	Removeduplicate1 r1=new Removeduplicate1();
	r1.remove(al);

	}

}
