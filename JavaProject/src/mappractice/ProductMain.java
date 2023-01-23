package mappractice;
import java.util.HashMap;
import java.util.Map;
public class ProductMain {
	void setMap(HashMap<Integer,HashMap<Integer,Product>>hmp1)
	{
		HashMap<Integer,Product> p1=new HashMap<Integer,Product>();
		HashMap<Integer,Product>p2=new HashMap<>();
		Product pd=new Product();
		pd.setName("sofa");
		pd.setMaterial("wooden");
		pd.setPrice(67000);
		p1.put(12, pd);
		
		Product pd1=new Product();
		pd1.setName("table");
		pd1.setMaterial("wood");
		pd1.setPrice(7000);
		p1.put(6, pd1);
		
		
		Product pd2=new Product();
		pd2.setName("chair");
		pd2.setMaterial("fiber");
		pd2.setPrice(1000);
		p2.put(4, pd2);
		
		Product pd3=new Product();
		pd3.setName("cupboard");
		pd3.setMaterial("wood");
		pd3.setPrice(59000);
		p2.put(2, pd3);
		
		hmp1.put(1222, p1);
		hmp1.put(3456, p2);
	}
	void createMap(HashMap<Integer,HashMap<Integer,Product>>hmp)
	{
		for(Map.Entry<Integer,HashMap<Integer,Product>> ent:hmp.entrySet())
		{
			System.out.println(ent);
			for(Map.Entry<Integer, Product> vent:ent.getValue().entrySet())
			{
				System.out.println(vent);
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		HashMap<Integer,HashMap<Integer,Product>>hmp=new HashMap<>();
		ProductMain pm=new ProductMain();
		pm.setMap(hmp);
		pm.createMap(hmp);

	}

}
