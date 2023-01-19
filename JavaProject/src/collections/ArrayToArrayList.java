package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s[]= {"Rahul","Shubham","Kanchan","Sona"};
		ArrayList<String> al=new ArrayList<String>(Arrays.asList(s));
		System.out.print(al+" ");

	}

}
