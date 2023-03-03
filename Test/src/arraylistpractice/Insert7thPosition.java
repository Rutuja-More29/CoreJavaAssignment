package arraylistpractice;

import java.util.ArrayList;

public class Insert7thPosition {

	public static void main(String[] args) {
		ArrayList<Integer>al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(60);
		al.add(70);
		al.add(50);
		al.add(80);
		al.add(90);
		System.out.println(al);
		al.add(7, 500);
		System.out.println(al);

	}

}
