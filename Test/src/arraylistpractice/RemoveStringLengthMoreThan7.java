package arraylistpractice;
import java.util.ArrayList;
import java.util.Iterator;
public class RemoveStringLengthMoreThan7 {
	void remove(ArrayList<String>al) {
		al.add("Sunday");
		al.add("Monday");
		al.add("Tuesday");
		al.add("Wednesday");
		al.add("Thursady");
		al.add("Friday");
		al.add("Saturday");
		
		Iterator<String>itr=al.iterator();
		while(itr.hasNext()) {
			String s=itr.next();
			if(s.length()>7) {
				itr.remove();
			}
			
		}
		System.out.println(al);
	}
	public static void main(String[] args) {
		ArrayList<String>al=new ArrayList<>();
		RemoveStringLengthMoreThan7  r=new RemoveStringLengthMoreThan7 ();
		r.remove(al);

	}

}
