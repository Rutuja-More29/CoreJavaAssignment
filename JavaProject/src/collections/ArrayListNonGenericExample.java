package collections;

import java.util.ArrayList;

public class ArrayListNonGenericExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(34.5);
		al.add("India");
		al.add(20);
		al.add("Pune");
		for(Object o: al)
		{
			String s=o.getClass().getSimpleName();
			if(s.equalsIgnoreCase("Integer"))
				System.out.println(o);
		}

	}

}
