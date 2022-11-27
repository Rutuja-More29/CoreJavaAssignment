package com.practice;

public class BirdMain {

	public static void main(String[] args) {
		Bird b=new Bird();
		b.setNoofbird(5);
		b.setName("parrot");
		b.setColor("green");
		
		Bird b1=new Bird();
		b1.setNoofbird(6);
		b1.setName("hen");
		b1.setColor("black");
		
		Bird b2=new Bird();
		b2.setNoofbird(4);
		b2.setName("duck");
		b2.setColor("white");
		
		
		System.out.println(b.getNoofbird()+" "+b.getName()+" "+b.getColor());
		System.out.println(b1.getNoofbird()+" "+b1.getName()+" "+b1.getColor());
		System.out.println(b2.getNoofbird()+" "+b2.getName()+" "+b2.getColor());
	}

}
