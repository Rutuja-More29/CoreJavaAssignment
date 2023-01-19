package collections;
import java.util.ArrayList;
import java.util.Iterator;
public class FailFastExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		al.add(70);
		al.add(80);
		al.add(90);
		
		Iterator<Integer>itr=al.iterator();
		while(itr.hasNext())
		{
			if(itr.next()==10)
			{
				al.remove(2);
			}
		}
		System.out.println(al);
		
	}

}
