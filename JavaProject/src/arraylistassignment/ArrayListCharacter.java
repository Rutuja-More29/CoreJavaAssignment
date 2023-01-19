package arraylistassignment;
import java.util.ArrayList;
public class ArrayListCharacter {
	void arrayList(ArrayList<Character>ac)
	{
		ac.add('d');
		ac.add('g');
		ac.add('h');
		ac.add('d');
		ac.add('h');
		ac.add('g');
		ArrayList<Character> al11=new ArrayList<>();
		for(Character c:ac)
		{
			if(!al11.contains(c))
			
				al11.add(c);
			}
		System.out.print(al11);
		
		}
	

	public static void main(String[] args) {
		ArrayList<Character> ac=new ArrayList<>();
		ArrayListCharacter alc=new ArrayListCharacter();
		alc.arrayList(ac);

	}

}
