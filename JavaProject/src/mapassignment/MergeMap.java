package mapassignment;
import java.util.HashMap;
public class MergeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String>hm=new HashMap<>();
		hm.put(1, "blue");
		hm.put(2, "red");
		hm.put(3, "orange");
		hm.put(4, "grey");
		System.out.println("1st map:"+hm);
		
		HashMap<Integer,String>hm1=new HashMap<>();
		hm1.put(55, "mango");
		hm1.put(66, "stawberry");
		hm1.put(99, "grapes");
		
		hm1.putAll(hm);
		System.out.println("merge:"+hm1);
		
		

	}

}
