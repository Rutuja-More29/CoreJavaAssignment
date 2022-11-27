package com.inheritance;
//containment- HAS-A relation 
public class CollegeMain {
                                 //aggregation use
	public static void main(String[] args) {
		Department d1 = new Department();
		d1.setId(1111);
		d1.setName("comp");
		
		Library l1=new Library();
		l1.setNoofbook(1000);
		l1.setIncharge("Mr.B");
		
		
		College c1=new College();
		c1.setCode(201);
		c1.setName("SCSMCOE");
		c1.setAddress("A.nagar");
		c1.setDept(d1);
		c1.setLib(l1);
		System.out.println(c1);

	}

}
