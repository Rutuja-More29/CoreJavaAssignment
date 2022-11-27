package com.classandobject;

public class Country {
//	String cname;
	void country(String cname)

	{
		switch (cname) {
		case "India":
			System.out.println("National game of india is Hockey");
			break;
		case "China":
			System.out.println("China is Table Tennis");
			break;
		case "Bangladesh":
			System.out.println("Bangladesh is Kabaddi");
			break;
		case "Italy":
			System.out.println("Italy is Football");
			break;
		case "United States":
			System.out.println("United States is Baseball");
			break;
		default:
			System.out.println("Enter valid Country name");
		}
	}

	public static void main(String[] args) {
		Country c = new Country();
		c.country("India");
	}

}
