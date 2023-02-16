package collectionpractice;

import java.util.ArrayList;

public class ArraylistCharacter {
	void createArrayList(ArrayList<Character>al)
	{
		al.add('d');
		al.add('h');
		al.add('g');
		al.add('h');
		al.add('d');
		al.add('g');
		ArrayList<Character>all=new ArrayList<>();
		for(Character c:al)
		{
			if(!all.contains(c))
			{
				all.add(c);
			}
		}
		System.out.println(all);
	}

	public static void main(String[] args) {
		ArrayList<Character>al=new ArrayList<>();
		ArraylistCharacter ac=new ArraylistCharacter();
		ac.createArrayList(al);

	}

}
