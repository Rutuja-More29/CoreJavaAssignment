package set;
import java.util.HashSet;
import java.util.Iterator;
public class StringHashSet {
	void createHashSet(HashSet<String>hs)
	{
		hs.add("peek");
		hs.add("dear");
		hs.add("tree");
		hs.add("see");
		hs.add("shree");
		hs.add("read");
		hs.add("weed");
		
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

	public static void main(String[] args) {
		HashSet<String>hs=new HashSet<>();
		StringHashSet sh=new StringHashSet();
		sh.createHashSet(hs);
		

	}

}
