package collectionpractice;
import java.util.ArrayList;

public class RemoveDuplicateElement {
	void creatArrayList(ArrayList<String>al)
	{
		al.add("mon");
		al.add("tue");
		al.add("wed");
		al.add("mon");
		al.add("thur");
		al.add("tue");
		
		ArrayList<String> al1=new ArrayList<>();
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
		RemoveDuplicateElement r=new RemoveDuplicateElement();
		r.creatArrayList(al);

	}

}
