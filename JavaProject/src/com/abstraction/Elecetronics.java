package com.abstraction;

public abstract class Elecetronics {

		int price,weight;
		String color;
		void processor()
		{
			System.out.println("1.3GHz quad core");
		}
		void semiConductor()
		{
			System.out.println("television has semiconductor");
		}
			abstract void rating();
			abstract void electricityConsumption();
			abstract void features();
}
