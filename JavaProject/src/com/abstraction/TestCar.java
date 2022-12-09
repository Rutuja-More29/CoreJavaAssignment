package com.abstraction;

public interface TestCar {
	void milage(int power);
	void crash();
	void speedTest(int speed);
	void breakTest();
	void loadTest();
}
class Swift1 implements TestCar{

	@Override
	public void milage(int power) {
		System.out.println("Milage:"+power);
		
	}

	@Override
	public void crash() {
		System.out.println("crash: 3 star");
		
	}

	@Override
	public void speedTest(int speed) {
		System.out.println("speed 160Kmph");
		
	}

	@Override
	public void breakTest() {
		System.out.println("Auto emergency break");
		
	}

	@Override
	public void loadTest() {
		System.out.println("load 780");
		
	}
	
}
