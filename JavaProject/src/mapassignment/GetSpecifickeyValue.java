package mapassignment;
import java.util.HashMap;
public class GetSpecifickeyValue {

	public static void main(String[] args) {
		HashMap<Integer,String> hm =new HashMap<>();
		hm.put(1, "Red");
		hm.put(2,"yellow");
		hm.put(3, "greeen");
		hm.put(4, "blue");
		System.out.println("specifiec keyvalue:"+hm.get(3));

	}

	
	

}
