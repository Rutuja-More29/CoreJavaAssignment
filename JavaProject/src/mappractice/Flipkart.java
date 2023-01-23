package mappractice;
import java.util.ArrayList;
import java.util.TreeMap;
public class Flipkart {
	void setArrayList(ArrayList<Order>al)
	{
		
		Order o1=new Order();
		o1.setOrderid(345);
		o1.setItemname("laptop");
		o1.setCity("pune");
		o1.setStatus("pending");
		al.add(o1);
		
		
		o1.setOrderid(456);
		o1.setItemname("smartPhone");
		o1.setCity("pune");
		o1.setStatus("delivered");
		al.add(o1);
		
		Order o2=new Order();
		o2.setOrderid(89);
		o2.setItemname("table");
		o2.setCity("sambhajinagar");
		o2.setStatus("pending");
		al.add(o2);
		
		o2.setOrderid(67);
		o2.setItemname("chair");
		o2.setCity("kolhapur");
		o2.setStatus("delivered");
		al.add(o2);
		
		Order o3=new Order();
		o3.setOrderid(45);
		o3.setItemname("bag");
		o3.setCity("nagar");
		o3.setStatus("delivered");
		
		al.add(o3);
		
		
		
	}
	void createMap(ArrayList<Order>al,TreeMap<String,Integer>tm)
	{
		for(Order o:al)
		{
			String s=o.getCity();
			String s1=o.getStatus();
			if(tm.containsKey(s))
			{
				tm.put(s,tm.get(s)+1 );
			}
			else
			{
				tm.put(s, 1);
			}
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Order>al=new ArrayList<>();
		TreeMap<String,Integer>tm=new TreeMap<>();
		Flipkart f=new Flipkart();
		f.setArrayList(al);
		f.createMap(al, tm);
		System.out.println(tm);
		
		

	}

}
