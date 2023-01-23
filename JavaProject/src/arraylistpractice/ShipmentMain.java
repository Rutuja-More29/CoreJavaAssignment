package arraylistpractice;

import java.util.Collections;
import java.util.LinkedList;

public class ShipmentMain {
	void check(LinkedList<Shipment>ll)
	{
		MyDate d1=new MyDate();
		d1.setDd(11);
		d1.setMm(1);
		d1.setYy(2023);
		
		MyDate d2=new MyDate();
		d2.setDd(13);
		d2.setMm(1);
		d2.setYy(2023);
		
		MyDate d3=new MyDate();
		d3.setDd(11);
		d3.setMm(1);
		d3.setYy(2023);
		
		Address a1=new Address();
		a1.setAddres("vani nagar");
		a1.setCity("ahmednagar");
		a1.setState("maharastra");
		
		Address a2=new Address();
		a2.setAddres("karve nagr");
		a2.setCity("pune");
		a2.setState("maharastra");
		
		Address a3=new Address();
		a3.setAddres("chandan nagar");
		a3.setCity("pune");
		a3.setState("maharastra");
		
		Shipment s1=new Shipment();
		s1.setShipId(111);
		s1.setCustname("rahul");
		s1.setAdd(a1);
		s1.setD(d1);
		ll.add(s1);
		
		Shipment s2=new Shipment();
		s2.setShipId(234);
		s2.setCustname("prita");
		s2.setAdd(a2);
		s2.setD(d2);
		ll.add(s2);
		
		Shipment s3=new Shipment();
		s3.setShipId(123);
		s3.setCustname("jiya");
		s3.setAdd(a3);
		s3.setD(d3);
		ll.add(s3);
	}
	void sortCity(LinkedList<Shipment>ll)
	{
		Collections.sort(ll,new CityNameSort());
		
	}
	void sortDate(LinkedList<Shipment>ll)
	{
		Collections.sort(ll,new ShipmentDateSort());
	}
	

	public static void main(String[] args) {
		LinkedList<Shipment>ll=new LinkedList<>();
		ShipmentMain s=new ShipmentMain();
		s.check(ll);
		s.sortCity(ll);
		System.out.println(ll);
		s.sortDate(ll);
		System.out.println(ll);

	}

}
