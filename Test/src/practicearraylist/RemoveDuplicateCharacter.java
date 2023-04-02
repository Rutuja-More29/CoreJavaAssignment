package practicearraylist;

import java.util.ArrayList;

public class RemoveDuplicateCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Character>al=new ArrayList<Character>();
		al.add('A');
		al.add('B');
		al.add('c');
		al.add('d');
		al.add('A');
		al.add('B');
		al.add('c');
		
		ArrayList<Character>al2=new ArrayList<Character>();
		for(Character c:al) {
			if(!al2.contains(c)) {
				al2.add(c);
			}
		}
		
		System.out.println(al2);
	}

}
