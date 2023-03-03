package arraylistpractice;

import java.util.ArrayList;

public class EmpdMain {

	public static void main(String[] args) {
	ArrayList<Empd> al=new ArrayList<>();
	al.add(new Empd(111,"riya",4500,new Dept(12,"test")));
	al.add(new Empd(222,"sanjay",56900,new Dept(15,"dev")));
   //make shallow copy	
	ArrayList<Empd >sh=new ArrayList<>(al);
	
	//make deep copy
	ArrayList<Empd>dc=new ArrayList<>(al.size());
	for(Empd e:al) {
		dc.add(new Empd(e.getId(), e.getName(), e.getSalary(), e.getD()));
		
	}
	System.out.println("Original ArrayList:"+al);
	System.out.println("Shallow copy:"+sh);
	System.out.println("deep copy:"+dc);
	}

}
