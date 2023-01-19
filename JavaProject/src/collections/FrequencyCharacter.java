package collections;

import java.util.ArrayList;

public class FrequencyCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Character> al = new ArrayList<>();
		al.add('a');
		al.add('b');
		al.add('c');
		al.add('d');
		al.add('a');
		al.add('d');
		al.add('c');
		al.add('a');
		al.add('b');
		al.add('c');
		al.add('c');

		for (int i = 0; i < al.size(); i++) {
			int count = 0;
			for (int j = i + 1; j < al.size(); j++) {
				if (al.get(i) == al.get(j)) {
					count++;
					al.set(j, '\0');
				}
			}
			if (al.get(i) != '\0') {
				System.out.println(al.get(i) + " " + count);
			}

		}

	}

}
