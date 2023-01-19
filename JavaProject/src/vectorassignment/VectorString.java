package vectorassignment;
import java.util.Vector;
import java.util.Iterator;
public class VectorString {
	void addElement(Vector<String>v)
	{
		v.add("pune");
		v.add("nashik");
		v.add("mumbai");
		v.add("aurangabad");
		v.add("ahmednagar");
		v.add("satara");
		v.add("sangali");
		System.out.println(v);
		Iterator<String> itr=v.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}
	public static void main(String[] args) {
		Vector<String> v=new Vector<>();
		VectorString vs=new VectorString();
		vs.addElement(v);

	}

}
