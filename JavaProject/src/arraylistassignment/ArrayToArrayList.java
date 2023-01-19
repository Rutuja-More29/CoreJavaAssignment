package arraylistassignment;
import java.util.ArrayList;
import java.util.Arrays;
public class ArrayToArrayList {

	public static void main(String[] args) {
	String arr[]= {"rita","sham","neha","seema"};
		ArrayList<String> al=new ArrayList<>(Arrays.asList(arr));
		System.out.println(al);
		
	}

}
