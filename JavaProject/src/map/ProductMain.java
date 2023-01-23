package map;

import java.util.HashMap;
import java.util.Map;

public class ProductMain {

	public static void main(String[] args) {
		HashMap<Integer,HashMap<Integer,Product>> city=new HashMap<>();
		HashMap<Integer,Product>hm1=new HashMap<>();
		HashMap<Integer,Product>hm2=new HashMap<>();
		HashMap<Integer,Product>hm3=new HashMap<>();
		
		hm1.put(1, new Product("sofa","wooden",30000));
		hm1.put(2, new Product("table","wood",5000));
		hm1.put(3, new Product("chair","wooden",1000));
		
		hm2.put(7, new Product("bed","wooden",39000));
		hm2.put(8, new Product("cupboard","wood",4000));
		hm2.put(9, new Product("showcase","wooden",67000));
		
		hm3.put(11, new Product("studytable","wooden",300));
		hm3.put(12, new Product("door","wood",1000));
		hm3.put(13, new Product("cupboard","wooden",5000));
		
		city.put(1111, hm1);
		city.put(2222, hm2);
		city.put(3333, hm3);
		
		for(Map.Entry<Integer, HashMap<Integer,Product>> ent:city.entrySet())
		{
			System.out.println(ent.getKey());
			for(Map.Entry<Integer, Product> vent:ent.getValue().entrySet())
			{
				System.out.println(vent.getKey()+" "+vent.getValue());
				
			}
			System.out.println();
		}
		
		

	}

}
