package com.array;

import java.util.Arrays;

public class Person {
int id;
String pname,address;
IdProof idp[];
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public IdProof[] getIdp() {
	return idp;
}
public void setIdp(IdProof[] idp) {
	this.idp = idp;
}
public String toString()
{
	return id+" "+pname+" "+address+" "+Arrays.toString(idp);
}
}
