package arraylistpractice;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayListString {
	void set(ArrayList<String>al) {
	al.add("pink");
	al.add("black");
	al.add("green");
	al.add("blue");
	al.add("grey");
}
 	void sort(ArrayList<String>al) {
 		Collections.sort(al);
 	}
	public static void main(String[] args) {
		ArrayList<String>al=new ArrayList<>();
		SortArrayListString s=new SortArrayListString();
		s.set(al);
		s.sort(al);
		System.out.println(al);

	}

}
