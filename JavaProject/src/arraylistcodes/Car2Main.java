package arraylistcodes;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
public class Car2Main {
	void setElement(ArrayList<Car2>ac)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size:");
		int size=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter car id,name,lyear,price:");
			int id=sc.nextInt();
			String name=sc.next();
			int lyear=sc.nextInt();
			int price=sc.nextInt();
			
			Car2 cr=new Car2();
			cr.setId(id);
			cr.setName(name);
			cr.setLyear(lyear);
			cr.setPrice(price);
			
			ac.add(cr);
			
		}
	}
	void removeElement(ArrayList<Car2>ac1)
	{
		Iterator<Car2> itcr=ac1.iterator();
		while(itcr.hasNext())
		{
			Car2 c2=itcr.next();
			if(c2.getLyear()==1990)
			{
				itcr.remove();
			}
		}
		
	}

	public static void main(String[] args) {
		ArrayList<Car2> ac=new ArrayList<>();
		Car2Main cm=new Car2Main();
		cm.setElement(ac);
		System.out.println(ac);
		cm.removeElement(ac);
		System.out.println(ac);

	}

}
