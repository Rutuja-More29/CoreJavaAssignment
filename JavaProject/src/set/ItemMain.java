package set;

import java.util.HashSet;

public class ItemMain {
	void set(HashSet<Item>hs)
	{
		hs.add(new Item(11,45,5,"dairymilk"));
		hs.add(new Item(10,4,7,"kitkat"));
		hs.add(new Item(1,5,3,"park"));
		
	}

	public static void main(String[] args) {
		HashSet<Item>hs=new HashSet<>();
		ItemMain m=new ItemMain();
		m.set(hs);
		System.out.println(hs);

	}

}
