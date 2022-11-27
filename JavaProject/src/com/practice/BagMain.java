package com.practice;

public class BagMain {

	public static void main(String[] args) {
		Bag b=new Bag();
		b.setBooks("English");
		b.setNotebooks("camel");
		b.setNoofpen(2);
		b.setNoofpencils(4);
		
		System.out.println(b.getBooks()+" "+b.getNotebook()+" "+b.getNoofpen()+" "+b.getNoofpencils());

	}

}
