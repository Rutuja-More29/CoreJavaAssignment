package mappractice;

import java.util.HashMap;
import java.util.Map;

//WAJP to test if a map contains a mapping for the specified value and also test map contains mapping for the specified key
public class MapTestExample {

	public static void main(String[] args) {
		HashMap<String,Integer>hm=new HashMap<>();
		hm.put("A", 1);
		hm.put("B", 2);
		hm.put("c", 3);
		hm.put("D", 4);
		
		//test by value
		int value=2;
	if(hm.containsValue(value))	
	System.out.println("The map contain mapping for value:"+value);
	else
		System.out.println("The map does not contain mapping for value:"+value);
	
	
	//test by key
	String key="B";
	if(hm.containsKey(key))
		System.out.println("The map contain mapping for key:"+key);
	else
		System.out.println("The map does not contain for key:"+key);
	}

}
