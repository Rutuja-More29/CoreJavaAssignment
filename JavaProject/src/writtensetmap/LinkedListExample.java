package writtensetmap;

import java.util.LinkedList;

public class LinkedListExample {
	
	public static void main(String []args)
	{
		LinkedList <Integer>ll=new LinkedList<>();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		
		
		
		LinkedList<Integer>ll2=new LinkedList<>();
		ll2.add(11);
		ll2.add(22);
		ll2.add(33);
		ll2.add(44);
		ll2.add(55);
		
		
		LinkedList<Integer> c=new LinkedList<>();
	
		for(int i=0;i<ll.size();i++)
		{
			if(i<ll.size()&& i<ll2.size())
			{
				c.add(ll.get(i));
				c.add(ll2.get(i));
			}
			else if(i<ll.size())
			{
				c.add(ll.get(i));
			}
		}
		System.out.println(c);	
		}

}
