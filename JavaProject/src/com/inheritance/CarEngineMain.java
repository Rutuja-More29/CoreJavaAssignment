package com.inheritance;
// using constructor -aggregation
public class CarEngineMain {

	public static void main(String[] args) {
		Engine e=new Engine("tata",4,89,"black");
		Car c= new Car(111,"audi","white",98000,e);
		System.out.println(c);

	}

}
