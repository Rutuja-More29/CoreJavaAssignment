package vectorassignment;
import java.util.Vector;
import java.util.Iterator;
public class IteratorFailFast {

	public static void main(String[] args) {
		Vector<Integer> v=new Vector<>();
		v.add(1);
		v.add(3);
		v.add(4);
		v.add(5);
		System.out.println(v);
		Iterator<Integer> itr=v.iterator();
		while(itr.hasNext())
		{
			if(itr.next()==1)
			{
				v.add(2);
			}
		}
		System.out.println(v);
	}

}
