package arraylistassignment;

import java.util.ArrayList;

public class JoinArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>al =new ArrayList<>();
		al.add("40");
		al.add("50");
		al.add("60");
		System.out.print("Original:"+al);
		ArrayList<String> al2=new ArrayList<>();
		al2.add("Sun");
		al2.add("Moon");
		al2.add("Earth");
		System.out.print("\n Original"+al2);
	    al.addAll(al2);
		System.out.print("\n Join Arraylist"+al);
		
	
		

	}

}
