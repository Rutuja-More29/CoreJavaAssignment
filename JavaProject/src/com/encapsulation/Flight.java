package com.encapsulation;

public class Flight {
	private int id,ticketrate;
	 private String company,destination;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public void setCompany(String company)
	{
		this.company=company;
	}
	public String getCompany()
	{
		return company;
	}
	public void setDestination(String Destination)
	{
		this.destination=destination;
	}
	public String getDestination()
	{
		return destination;
	}
	public void setTicketrate(int ticketrate) 
	{
		if(ticketrate> 250)
			this.ticketrate=ticketrate;
			
		else
			System.out.println("2nd class");
	}
	public int getTicketrate()
	{
		return ticketrate;
	}
	
	
	public static void main(String[] args) {
		

	}

}
