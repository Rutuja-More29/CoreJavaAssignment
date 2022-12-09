package com.inheritanceparentchild;

public class Patient extends Doctor {
int pid,bedno;
String disease;
public void setPid(int pid) {
	this.pid = pid;
}
public void setBedno(int bedno) {
	this.bedno = bedno;
}
public void setDisease(String disease) {
	this.disease = disease;
}
	void display()
	{
		super.display();
		System.out.println( pid+" "+disease+" "+bedno);
	}
}
