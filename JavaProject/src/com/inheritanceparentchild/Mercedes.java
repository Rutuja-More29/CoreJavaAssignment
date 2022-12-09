package com.inheritanceparentchild;

public class Mercedes extends Car1 {

	void dashboard()
	{
		super.dashboard();     // will use to represent immediate parent class
		System.out.println("Mercedes have :screen");
	}
	void engine()
	{
		System.out.println("19960 cc");
	}
}
