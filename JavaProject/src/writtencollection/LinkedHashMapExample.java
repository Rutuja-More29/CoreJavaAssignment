package writtencollection;


import java.util.LinkedHashMap;


public class LinkedHashMapExample {
	void create(LinkedHashMap<String,Integer> lhm)
	{
		lhm.put("tree",11);
		lhm.put( "peak",12);
		lhm.put("weak",13);
		lhm.put( "knee",14);
		lhm.put( "bee",15);
		
		System.out.println(lhm);
	}

	public static void main(String[] args) {
		LinkedHashMap<String,Integer> lhm=new LinkedHashMap<>();
		LinkedHashMapExample l=new LinkedHashMapExample();
		l.create(lhm);

	}

}
