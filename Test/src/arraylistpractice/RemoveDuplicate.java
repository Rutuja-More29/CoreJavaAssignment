package arraylistpractice;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveDuplicate {
	void removeduplicate(ArrayList<String>al) {
		al.add("sun");
		al.add("mon");
		al.add("sat");
		al.add("sun");
		al.add("mon");
		al.add("sat");
		al.add("sun");
		al.add("mon");
		ArrayList<String>al2=new ArrayList<>();
		for(String s:al) {
			if(!al2.contains(s)) {
				al2.add(s);
			}
		}
		System.out.println(al2);
	}

	public static void main(String[] args) {
		ArrayList<String>al=new ArrayList<>();
		
		RemoveDuplicate r=new RemoveDuplicate();
		r.removeduplicate(al);

	}

}
