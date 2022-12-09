package com.inheritanceparentchild;

public class Father {
	String name;
	int age;
	static String surname;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	void address()
	{
		System.out.println("Staying at pune...");
	}
}
