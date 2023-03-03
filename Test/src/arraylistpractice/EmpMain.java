package arraylistpractice;
import java.util.ArrayList;
import java.util.Iterator;
public class EmpMain {
	void check(ArrayList<Emp>al) {
		Emp e=new Emp();
		e.setId(11);
		e.setName("anu");
		e.setSal(55000);
		al.add(e);
		Emp e1=new Emp();
		e1.setId(12);
		e1.setName("abhi");
		e1.setSal(89000);
		al.add(e1);
		Emp e2=new Emp();
		e2.setId(13);
		e2.setName("radha");
		e2.setSal(78000);
		al.add(e2);
		Iterator<Emp>itr=al.iterator();
		while(itr.hasNext()) {
			Emp ep=itr.next();
			if(ep.getSal()>59000) {
				System.out.println(ep);
			}
		}
	}

	public static void main(String[] args) {
		ArrayList<Emp>al=new ArrayList<>();
		EmpMain em=new EmpMain();
		em.check(al);

	}

}
