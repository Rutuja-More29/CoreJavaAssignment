package vectorassignment;
import java.util.Vector;
import java.util.Enumeration;
public class EnumeratorFailSafe {

	public static void main(String[] args) {
		Vector<Integer> v=new Vector<>();
		v.add(10);
		v.add(20);
		v.add(100);
		v.add(200);
		v.add(300);
		v.add(400);
		System.out.println(v);
		Enumeration<Integer>en= v.elements();
		while(en.hasMoreElements())
		{
			if(en.nextElement()==10)
			{
				v.add(900);
			}
		}
		System.out.println(v);

	}

}
