package arraylistpractice;
import java.util.ArrayList;
public class CharacterFrequency {

	public static void main(String[] args) {
		ArrayList<Character>al=new ArrayList<>();
		al.add('a');
		al.add('b');
		al.add('c');
		al.add('a');
		al.add('d');
		al.add('c');
		al.add('b');
		al.add('b');
		
		int cnt=0;
		for(int i=0;i<al.size();i++) {
			for(int j=i+1;j<al.size();j++) {
				if(al.get(i)==al.get(j)) {
					cnt++;
					al.set(j, '\0');
				}
				
			}
			if(al.get(i)!='\0') {
				System.out.println(al.get(i)+" "+cnt);
			}
		}

	}

}
