package com.encapsulation;

public class BookMain {

	public static void main(String[] args) {
		Book b=new Book();
		b.setId(111);
		b.setTitle("youcanwin");
		b.setAuthor("shivkhera");
		b.setPrice(155);
		System.out.println(b.getId()+" "+b.getTitle()+" "+b.getAuthor()+" "+b.getPrice());

	}

}
