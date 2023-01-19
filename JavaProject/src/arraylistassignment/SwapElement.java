package arraylistassignment;
import java.util.ArrayList;
import java.util.Collections;
public class SwapElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(7);
		System.out.print("Before swapping:"+al+" ");
		System.out.println();
		Collections.swap(al, 2, 3);
		System.out.print("After swapping:"+al+" ");

	}

}
