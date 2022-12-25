package com.array;

import java.util.Arrays;

public class Company {
int cid;
String cname;
Department dept[];
Company(int cid,String cname,Department dept[])
{
	this.cid=cid;
	this.cname=cname;
	this.dept=dept;
}
public String toString()
{
	return cid+" "+cname+" "+Arrays.toString(dept);
}
}
