package writtenarraylist;
import java.util.ArrayList;
import java.util.Iterator;
public class FailFastExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<>();
		al.add(5);
		al.add(10);
		al.add(15);
		al.add(20);
		al.add(25);
		al.add(30);
		al.add(35);
		al.add(40);
		Iterator<Integer>itr=al.iterator();
		while(itr.hasNext())
		{
			if(itr.next()==20)
			//	itr.remove();
				al.remove(20);
		}
		System.out.println(al);
	}

}
