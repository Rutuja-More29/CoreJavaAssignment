package arraylistassignment;

import java.util.ArrayList;
import java.util.Iterator;

public class StringArrayList {
	void arrayList(ArrayList<String> s) {
		s.add("Monday");
		s.add("Tuesday");
		s.add("Wednesday");
		s.add("Thursday");
		s.add("Friday");
		s.add("Saturday");
		s.add("Sunday");
		System.out.println(s);

		Iterator<String> itr = s.iterator();
		while (itr.hasNext()) {
			String ss = itr.next();
			if (ss.length() >= 7) {
				itr.remove();
			}
		}

		System.out.println(s);
	}

	public static void main(String[] args) {
		ArrayList<String> als = new ArrayList<>();
		StringArrayList as = new StringArrayList();
		as.arrayList(als);

	}

}
