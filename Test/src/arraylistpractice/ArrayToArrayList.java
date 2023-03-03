package arraylistpractice;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList {

	public static void main(String[] args) {
	Integer a[]= {1,2,3,45,6,8};
	ArrayList<Integer>al=new ArrayList<>(Arrays.asList(a));
	System.out.println(al);

	}

}
