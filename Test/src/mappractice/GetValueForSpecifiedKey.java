package mappractice;

import java.util.HashMap;

public class GetValueForSpecifiedKey {

	public static void main(String[] args) {
	HashMap<String,Integer>hm=new HashMap<>();
	hm.put("A", 1);
	hm.put("B", 2);
	hm.put("c", 3);
	hm.put("D", 4);
	
	String key="A";
	if(hm.containsKey(key)) {
		int value=hm.get(key);
		System.out.println("The value of key " +key+" is "+value);
	}
	else
	{
		System.out.println("The map does not contain a mapping for the key"+key);
	}

	}

}
