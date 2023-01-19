package vectorassignment;
import java.util.Enumeration;
import java.util.Vector;

public class IterateVectorEnumerator {
	void iteratElement(Vector<Integer>v)
	{
		v.add(10);
		v.add(60);
		v.add(100);
		v.add(1);
		v.add(888);
		v.add(2);
		System.out.println(v);
		Enumeration<Integer> en=v.elements();
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement());
		}
		
	}
	public static void main(String[] args) {
		Vector<Integer> v=new Vector<>();
		IterateVectorEnumerator e=new IterateVectorEnumerator();
		e.iteratElement(v);

	}

}
