package test;

public class Course {
int cid;
String cname;
Course(int cid,String cname){
	this.cid=cid;
	this.cname=cname;
}
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public String toString() {
	return cid+" "+cname;
}
}
