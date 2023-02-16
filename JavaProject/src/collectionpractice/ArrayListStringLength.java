package collectionpractice;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListStringLength {
	void createArrayList(ArrayList<String>al)
	{
		al.add("Monday");
		al.add("tuesday");
		al.add("wednesday");
		al.add("thursday");
		al.add("friday");
		al.add("saturday");
		al.add("sunday");
		Iterator<String>itr=al.iterator();
		while(itr.hasNext())
		{
			String s=itr.next();
			if(s.length()>7)
			{
				itr.remove();
			}
		}
		System.out.println(al);
		
	}
	public static void main(String[] args) {
		ArrayList<String>al=new ArrayList<>();
		ArrayListStringLength sl=new ArrayListStringLength();
		sl.createArrayList(al);

	}

}
