package com.abstraction;

public interface Mobile {
	void calling();
	void messaging();
	void calculator();
	void calender();
	void battery();
}
class SmartPhone implements Mobile{

	@Override
	public void calling() {
		System.out.println("calling");
		
	}

	@Override
	public void messaging() {
		System.out.println("messaging");
		
	}

	@Override
	public void calculator() {
		System.out.println("Smartphone has calculator");
		
	}

	@Override
	public void calender() {
		System.out.println("calender feature");
		
	}

	@Override
	public void battery() {
		System.out.println("built in battery");
		
	}
	
}
