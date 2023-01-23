package arraylistpractice;
import java.util.ArrayList;
import java.util.Iterator;
public class RemoveDuplicate {
	void removeDuplicate(ArrayList<String>al)
	{
		al.add("sun");
		al.add("mon");
		al.add("sat");
		al.add("mon");
		al.add("sun");
		al.add("sat");
		ArrayList<String>al1=new ArrayList<>();
		for(String s:al)
		{
			if(!al1.contains(s))
			{
				al1.add(s);
			}
			
		}
		System.out.println(al1);
	}

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		RemoveDuplicate r=new RemoveDuplicate();
		r.removeDuplicate(al);

	}

}
