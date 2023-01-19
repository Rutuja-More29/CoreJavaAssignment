package map;
import java.util.ArrayList;
import java.util.HashMap;
public class OrderMain {
	void setArrayList(ArrayList<Order> al)
	{
		al.add(new Order(102,600,"pune",new OrderStatus("17/01/2023","pending")));
		al.add(new Order(1,1000,"ahmednagar",new OrderStatus("10/01/2023","delivered")));
		al.add(new Order(122,1200,"nashik",new OrderStatus("15/01/2023","pending")));
		al.add(new Order(502,800,"pune",new OrderStatus("9/01/2023","delivered")));
		al.add(new Order(192,500,"mumbai",new OrderStatus("16/01/2023","pending")));
		al.add(new Order(12,600,"pune",new OrderStatus("6/01/2023","delivered")));
		al.add(new Order(145,300,"nashik",new OrderStatus("11/01/2023","pending")));
		al.add(new Order(892,600,"pune",new OrderStatus("16/01/2023","pending")));
	}
	void createMap(ArrayList<Order>al,HashMap<String,Integer>hm)
	{
		for(Order o:al)
		{
			String s=o.orst.status;
			if(hm.containsKey(s))
			{
				hm.put(s, hm.get(s)+1);
			}
			else
			{
				hm.put(s, 1);
			}
		}
	}

	public static void main(String[] args) {
		ArrayList<Order> al=new ArrayList<>();
		HashMap<String,Integer>hm=new HashMap<>();
		OrderMain m=new OrderMain();
		m.setArrayList(al);
		m.createMap(al, hm);
		System.out.println(hm);

	}

}
