package writtencollection;
import java.util.HashSet;
import java.util.Iterator;
public class HashSetEx {

	public static void main(String[] args) {
		HashSet<String>hs=new HashSet<>();
		hs.add("tree");
		hs.add("tea");
		hs.add("knee");
		hs.add("weak");
		hs.add("seek");
		hs.add("see");
		
		Iterator<String>itr=hs.iterator();
		while(itr.hasNext())
		{
			String s=itr.next();
			if(s.contains("ee"))
			{
				itr.remove();
			}
		}
		System.out.println(hs);
		

	}

}
