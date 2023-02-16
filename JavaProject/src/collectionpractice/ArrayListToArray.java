package collectionpractice;

import java.util.ArrayList;

public class ArrayListToArray {

	public static void main(String[] args) {
		ArrayList<Integer>al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		Integer a[]=new Integer[al.size()];
		for(int i=0;i<a.length;i++)
		{
			a[i]=al.get(i);
		
		System.out.println(a[i]);
		}
	}

}
