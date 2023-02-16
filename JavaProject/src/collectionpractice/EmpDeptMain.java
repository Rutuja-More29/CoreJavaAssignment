package collectionpractice;
import java.util.LinkedList;
import java.util.ListIterator;
public class EmpDeptMain {
	void setList(LinkedList<Emp>ll)
	{
		Emp e=new Emp();
		Emp e2=new Emp();
		 
		Dept d1=new Dept();
		Dept d2=new Dept();
		d1.setDid(11);
		d1.setDname("dev");
		
		d2.setDid(12);
		d2.setDname("test");
		
		e.setId(100);
		e.setName("radha");
		e.setD(d1);
		ll.add(e);
		
		e2.setId(101);
		e2.setName("rahul");
		e2.setD(d2);
		ll.add(e2);
		
		ListIterator<Emp>itrl=ll.listIterator();
		while(itrl.hasNext())
		{
			Emp em=itrl.next();
			if(em.getId()==100)
				itrl.remove();
				
		}
		System.out.println(itrl);

	}
	public static void main(String[] args) {
		LinkedList<Emp>ll=new LinkedList<>();
		EmpDeptMain edm=new EmpDeptMain();
		edm.setList(ll);

	}

}
