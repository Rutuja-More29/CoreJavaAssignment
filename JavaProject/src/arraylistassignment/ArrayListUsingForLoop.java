package arraylistassignment;

import java.util.ArrayList;

public class ArrayListUsingForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<>();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		al.add(500);
		
		for(int i=0;i<al.size();i++)
		{
			System.out.print(al.get(i)+" ");
		}

	}

}
