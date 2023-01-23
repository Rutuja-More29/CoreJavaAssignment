package arraylistpractice;
import java.util.ArrayList;
import java.util.Iterator;
public class FailFastExample {
	void check(ArrayList<String>al)
	{
		al.add("jan");
		al.add("feb");
		al.add("march");
		al.add("april");
		al.add("may");
		al.add("june");
		Iterator<String>itr=al.iterator();
		while(itr.hasNext())
		{
			String s=itr.next();
			if(s.contains("feb"))
			{
				al.add("july");
			}
		}
		System.out.println(al);
		
	}

	public static void main(String[] args) {
		ArrayList<String>al=new ArrayList<>();
		FailFastExample f=new FailFastExample();
		f.check(al);
		

	}

}
