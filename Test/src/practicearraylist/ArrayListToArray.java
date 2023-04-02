package practicearraylist;

import java.util.ArrayList;

public class ArrayListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>al=new ArrayList<>();
		al.add(10);
		al.add(11);
		al.add(12);
		al.add(13);
		al.add(14);
		
		Integer a[]=new Integer[al.size()];
		for(int i=0;i<a.length;i++) {
			a[i]=al.get(i);
			System.out.print(a[i]+" ");
		}

	}

}
