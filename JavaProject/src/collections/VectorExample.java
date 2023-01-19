package collections;
import java.util.Vector;
import java.util.Enumeration;
public class VectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v=new Vector<>();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		
		Enumeration<Integer> en=v.elements();
		while(en.hasMoreElements())
		{
			if(en.nextElement()==10)
			{
				v.add(100);
			}
		}
		
		System.out.println(v);
	}

}
