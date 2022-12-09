package com.inheritanceparentchild;

public class Person1 {
String name,gender;
int age;
long contact;
public void setName(String name) {
	this.name = name;
}
public void setGender(String gender) {
	this.gender = gender;
}
public void setAge(int age) {
	this.age = age;
}
public void setContact(long contact) {
	this.contact = contact;
}
void display()
{
	System.out.println(name+" "+age+" "+gender+" "+contact);
}
}
