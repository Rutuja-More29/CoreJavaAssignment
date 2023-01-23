package arraylistpractice;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class EmpDeptMain {
	void setArrayList(LinkedList<Emp> il) {

		Dept d1 = new Dept();
		Dept d2 = new Dept();
		Dept d3 = new Dept();
		d1.setDid("100");
		d1.setDname("dev");

		d2.setDid("123");
		d2.setDname("test");

		d3.setDid("45");
		d3.setDname("sales");

		Emp em1 = new Emp();
		em1.setId(10);
		em1.setName("rita");
		em1.setD(d1);
		il.add(em1);

		Emp em2 = new Emp();
		em2.setId(87);
		em2.setName("sona");
		em2.setD(d2);
		il.add(em2);

		Emp em3 = new Emp();
		em3.setId(90);
		em3.setName("jiya");
		em3.setD(d3);
		il.add(em3);

		Iterator<Emp> itr = il.iterator();
		while (itr.hasNext()) {
			Emp e = itr.next();
			if (e.getId()==10) {
				itr.remove();
			}

		}

		System.out.println(il);
	
		
	}

	public static void main(String[] args) {
		LinkedList<Emp> ll = new LinkedList<>();

		EmpDeptMain edm = new EmpDeptMain();
		edm.setArrayList(ll);

	}

}
