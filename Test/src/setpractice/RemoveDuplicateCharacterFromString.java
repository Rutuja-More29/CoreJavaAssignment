package setpractice;

import java.util.HashSet;
import java.util.Iterator;

public class RemoveDuplicateCharacterFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String>hs=new HashSet<>();
		hs.add("tree");
		hs.add("week");
		hs.add("free");
		hs.add("knee");
		hs.add("tea");
		hs.add("sea");
		hs.add("see");
		
		Iterator<String>itr=hs.iterator();
		while(itr.hasNext()) {
			String s=itr.next();
			if(s.contains("ee")) {
				itr.remove();
			}
		}
		System.out.println(hs);
	}

}
