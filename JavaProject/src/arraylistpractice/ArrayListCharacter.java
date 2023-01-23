package arraylistpractice;
import java.util.ArrayList;
public class ArrayListCharacter {
	void setArrayList(ArrayList<Character>al)
	{
		al.add('a');
		al.add('b');
		al.add('c');
		al.add('a');
		al.add('b');
		al.add('c');
		al.add('e');
		al.add('g');
		al.add('f');
		ArrayList<Character>al1=new ArrayList<>();
		for(Character c:al)
		{
			if(!al1.contains(c))
			{
				al1.add(c);
			}
		}
		System.out.println(al1);
		
	}

	public static void main(String[] args) {
		ArrayList<Character>al=new ArrayList<>();
		ArrayListCharacter a=new ArrayListCharacter();
		a.setArrayList(al);
		

	}

}
