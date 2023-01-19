package collections;

import java.util.ArrayList;


public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ll=new ArrayList<>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(10);
		ll.add(40);
		ll.add(30);
		ll.add(50);
		ll.add(20);
		
		ArrayList<Integer>al1=new ArrayList<>();
		for(Integer i:ll)
		{
			if(!al1.contains(i))
			{
				al1.add(i);
			}
		}
		System.out.println(al1);

	}

}
