package comparatorcomparablepractice;

import java.util.ArrayList;
import java.util.Collections;

public class IntegerArrayList {

	void setArraylist(ArrayList<Integer>al) {
		al.add(20);
		al.add(30);
		al.add(60);
		al.add(10);
		al.add(80);
	}
	void sortlist(ArrayList<Integer>al) {
		Collections.sort(al);
	}
	public static void main(String[] args) {
		ArrayList<Integer>al=new ArrayList<>();
		IntegerArrayList a=new IntegerArrayList();
		a.setArraylist(al);
		a.sortlist(al);
		System.out.println(al);

	}

}
