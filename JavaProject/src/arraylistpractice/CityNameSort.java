package arraylistpractice;
import java.util.Comparator;
public class CityNameSort implements Comparator<Shipment> {


	public int compare(Shipment o1, Shipment o2) {
		// TODO Auto-generated method stub
		return o1.getAdd().getCity().compareToIgnoreCase(o2.getAdd().getCity());
	}
	

	
}
