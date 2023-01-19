package collections;

import java.util.ArrayList;

public class AddingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Character> ac=new ArrayList<>();
		ac.add('a');
		ac.add('b');
		ac.add('c');
		ac.add('a');
		ac.add('b');
		ac.add('e');
		ac.add('a');
		
		System.out.println(ac);
		for(int i=0;i<ac.size();i++)
		{
			if(ac.get(i)=='a')
			{
				ac.add(i+1,'z');
			}
		}
		System.out.println(ac);
	}

}
