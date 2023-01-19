package arraylistassignment;
import java.util.ArrayList;
import java.util.Collections;
public class SortArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Float> af=new ArrayList<>();
		af.add(1.5f);
		af.add(2.5f);
		af.add(3.5f);
		af.add(6.5f);
		af.add(4.5f);
		af.add(5.5f);
		System.out.println("original:"+af);
		Collections.sort(af);
		System.out.println(af);
		
	}

}
