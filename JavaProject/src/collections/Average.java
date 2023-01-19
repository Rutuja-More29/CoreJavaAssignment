package collections;

import java.util.ArrayList;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<>();
		al.add(20);
		al.add(30);
		al.add(90);
		al.add(60);
		int average = 0;
		int sum = 0;
		for (int i = 0; i < al.size(); i++) {
			sum = sum + al.get(i);
			average = sum / al.size();

		}
		System.out.println("Average is:" + average);
	}

}
