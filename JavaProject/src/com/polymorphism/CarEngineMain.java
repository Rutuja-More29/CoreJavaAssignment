package com.polymorphism;
//inheritance
public class CarEngineMain {

	public static void main(String[] args) {
		Engine e1=new Engine();
		e1.setCompany("tata");
		e1.setCylinder(4);
		e1.setRpm("1000 rpm");
		e1.setTorque(89);
		
		
		Car c=new Car();
		c.setId(111);
		c.setName("audi");
		//c.setColor("blue");
		c.setPrice(4500000);
		c.setE(e1);
		
		
		System.out.println("Information of car:");
		System.out.println(c.getName()+" "+c.getId()+" "+c.getPrice());
		System.out.println("Engine:"+c.getE());
		

	}

}
