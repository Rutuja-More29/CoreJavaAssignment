package arraylistpractice;

import java.util.ArrayList;

public class RemoveDuplicateCharacter {

	public static void main(String[] args) {
		ArrayList<Character>al=new ArrayList<>();
		al.add('d');
		al.add('g');
		al.add('h');
		al.add('d');
		al.add('d');
		al.add('h');
		al.add('g');
		ArrayList<Character>al2=new ArrayList<>();
		for(Character c:al) {
			if(!al2.contains(c)) {
				al2.add(c);
			}
		}
		System.out.println(al2);

	}

}
