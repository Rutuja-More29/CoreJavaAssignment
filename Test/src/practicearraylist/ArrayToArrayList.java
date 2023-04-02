package practicearraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[]= {1,2,3,4,5,6};
		ArrayList<Integer>al=new ArrayList<>(Arrays.asList(a));
		System.out.println(al);

	}

}
