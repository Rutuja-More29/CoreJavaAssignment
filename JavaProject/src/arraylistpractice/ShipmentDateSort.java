package arraylistpractice;
import java.util.Comparator;
public class ShipmentDateSort implements Comparator<Shipment> {

	public int compare(Shipment s1,Shipment s2)
	{
		if(s1.getD().getDd()>s2.getD().getDd())
			return 1;
		else if(s1.getD().getDd()<s2.getD().getDd())
		return -1;
		else
			return 0;
		
		
	}
}
