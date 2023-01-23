package arraylistpractice;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
public class FailSafeIterator {
	void setArrayList(CopyOnWriteArrayList<Integer>cal)
	{
		cal.add(10);
		cal.add(20);
		cal.add(30);
		cal.add(40);
		cal.add(50);
		cal.add(90);
		cal.add(80);
		cal.add(60);
		Iterator<Integer>itr=cal.iterator();
		while(itr.hasNext())
		{
			Integer il=itr.next();
			if(il==10)
			{
				cal.add(1000);
			}
		}
		System.out.println(cal);
		
	}

	public static void main(String[] args) {
		CopyOnWriteArrayList<Integer> cal=new CopyOnWriteArrayList<>();
		FailSafeIterator f=new FailSafeIterator();
		f.setArrayList(cal);

	}

}
