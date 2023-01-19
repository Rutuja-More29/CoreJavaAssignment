package arraylistcodes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class DeptEmpMain {
	void setArraylist(ArrayList<Emp>e1)
	{
		ArrayList<Emp>emp1=new ArrayList<>();
		ArrayList<Emp>emp2=new ArrayList<>();
		ArrayList<Emp>emp3=new ArrayList<>();
		
		Dept d1=new Dept();
		d1.setDid(311);
		d1.setDname("dev");
		
		Dept d2=new Dept();
		d2.setDid(231);
		d2.setDname("test");
		
		Dept d3=new Dept();
		d3.setDid(511);
		d3.setDname("dev");
		
		Emp em1=new Emp();
		em1.setId(222);
		em1.setName("siya");
		em1.setD(d1);
		e1.add(em1);
		
		Emp em2=new Emp();
		em2.setId(344);
		em2.setName("vira");
		em2.setD(d2);
		e1.add(em2);
		
		Emp em3=new Emp();
		em3.setId(241);
		em3.setName("nisha");
		em3.setD(d3);
		e1.add(em3);
				
	}
	void removeEmployee(ArrayList<Emp> empl)
	{
		Iterator<Emp> itr=empl.iterator();
		while(itr.hasNext())
		{
			Emp ee=itr.next();
			if(ee.id==222 )
			{
				itr.remove();
			}
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Emp> e=new ArrayList<>();
		
			DeptEmpMain dem= new DeptEmpMain();
			dem.setArraylist(e);
			System.out.println(e);
			dem.removeEmployee(e);
			System.out.println(e);
			
		}

	

}
