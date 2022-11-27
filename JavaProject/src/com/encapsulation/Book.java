package com.encapsulation;

public class Book {
	private int id,price;
	private String title,author;
	public void setId(int id)
	{
		this.id=id;
	}
	public int  getId()
	{
		return id;
	}
	public void setTitle(String title)
	{
		this.title=title;
	}
	public String getTitle()
	{
		return title;
	}
	public void setAuthor(String author)
	{
		this.author=author;
	}
	public String getAuthor()
	{
		return author;
	}
	public void setPrice(int price)
	{
		if(price>10)
			this.price=price;
		else
			System.out.println("invalid price");
	}
	public int getPrice()
	{
		return price;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
