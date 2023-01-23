package set;

import java.util.HashSet;
import java.util.TreeSet;

public class Item1Main {
	void setList(TreeSet<Item>ts1)
	{
		ts1.add(new Item(11,45,5,"dairymilk"));
		ts1.add(new Item(10,4,7,"kitkat"));
		ts1.add(new Item(1,5,3,"park"));
		
	}

	public static void main(String[] args) {
		TreeSet<Item1>ts=new TreeSet<>();
		Item1Main m=new Item1Main();
	//	m.setList(ts1);
		System.out.println(ts);

	}
}
