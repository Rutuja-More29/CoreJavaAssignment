package practicearraylist;

import java.util.ArrayList;

public class DuplicateStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>al=new ArrayList<>();
		al.add("sum");
		al.add("mon");
		al.add("tue");
		al.add("thur");
		al.add("sum");
		al.add("mon");
		al.add("tue");
		
		ArrayList<String>al2=new ArrayList<>();
		for(String s:al) {
			if(!al2.contains(s)) {
				al2.add(s);
			}
		}
		System.out.println(al2);
	}

}
