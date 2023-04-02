package practicearraylist;

public class Employee {
	int eid;
	String ename;
	Department d;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Department getD() {
		return d;
	}
	public void setD(Department d) {
		this.d = d;
	}
	public String toString() {
		return eid+" "+ename+" "+d;
	}
}
