package com.inheritanceparentchild;

public class Student extends Person {
	float percentage;
	String college;
	 void grade()
	 {
		 if(percentage>80)
		 {
			 System.out.println("grade A");
		 }
		 else if(percentage>60)
		 {
			 System.out.println("grade B");
		 }
		 else 
		 {
			 System.out.println("grade C");
		 }
	 }
	 
	

	public float getPercentage() {
		return percentage;
	}



	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}



	public String getCollege() {
		return college;
	}



	public void setCollege(String college) {
		this.college = college;
	}



	public static void main(String[] args) {
		

	}

}
