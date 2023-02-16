package collectionpractice;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList {

	public static void main(String[] args) {
		Integer a[]= {1,2,3,4,7,8,5};
		
		ArrayList<Integer> al= new ArrayList<> (Arrays.asList(a));
		System.out.println(al);

	}

}
