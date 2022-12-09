package com.abstraction;

public class BankProject implements Project {
	 public void requirement()
	 {
		 System.out.println("BankProject :data security");
	 }
	 public void planning()
	 {
		 System.out.println("project planning");
	 }
	  public void designing()
	 {
		System.out.println("Design project"); 
	 }
	  public void development()
	  {
		  System.out.println("Developed project");
	  }
	  public void testing()
	  {
		  System.out.println("test the developed project");
	  }
	  public void maintaince()
	  {
		  System.out.println("after develiver to customer");
	  }
	@Override
	public void deployment() {
		System.out.println("deployment");
		
	}
}
