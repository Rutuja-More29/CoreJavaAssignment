package com.array;

public class Movie {
int id,releaseyear;
String name;
Movie(int id,String name,int releaseyear)
{
	this.id=id;
	this.name=name;
	this.releaseyear=releaseyear;
}
public String toString()
{
	return id+" "+name+" "+releaseyear;
}

}
