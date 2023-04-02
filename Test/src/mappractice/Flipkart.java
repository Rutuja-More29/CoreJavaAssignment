package mappractice;

import java.util.ArrayList;
import java.util.TreeMap;

public class Flipkart {
	void createList(ArrayList<Order>al) {
		Order o1=new Order();
		o1.setOrderid(121);
		o1.setItemname("laptop");
		o1.setCity("pune");
		o1.setStatus("delivered");
		al.add(o1);
		
		Order o2=new Order();
		o2.setOrderid(234);
		o2.setItemname("television");
		o2.setCity("mumbai");
		o2.setStatus("pending");
		al.add(o2);
		
		Order o3=new Order();
		o3.setOrderid(456);
		o3.setItemname("AppleMob");
		o3.setCity("pune");
		o3.setStatus("delivered");
		al.add(o3);
	}
	void createMap(ArrayList<Order>al,TreeMap<String,Integer>tr) {
		for(Order o:al) {
			String s=o.getCity();
			String s1=o.getStatus();
			if(tr.containsKey(s)) {
				tr.put(s, tr.get(s)+1);
			}else
			{
				tr.put(s, 1);
			}
		}
		System.out.println(tr);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Order>al=new ArrayList<>();
		TreeMap<String,Integer>tr=new TreeMap<>();
		Flipkart f=new Flipkart();
		f.createList(al);
		f.createMap(al, tr);

	}

}
