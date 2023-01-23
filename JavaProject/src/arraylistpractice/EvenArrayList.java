package arraylistpractice;
import java.util.ArrayList;
import java.util.Iterator;
public class EvenArrayList {
	void setArraylist(ArrayList<Integer>al)
	{
		al.add(10);
		al.add(20);
		al.add(5);
		al.add(4);
		al.add(2);
		al.add(3);
		al.add(7);
	}
	void iterateArrayList(ArrayList<Integer>al)
	{
		Iterator<Integer>itr=al.iterator();
		while(itr.hasNext())
		{
			Integer i=itr.next();
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		ArrayList<Integer>al=new ArrayList<>();
		EvenArrayList a=new EvenArrayList();
		a.setArraylist(al);
		a.iterateArrayList(al);

	}

}
