package arraylistassignment;

import java.util.ArrayList;

public class Employee {
	int empid;
	String ename;
	Department d;

	public void setEmpid(int empid) {
		this.empid = empid;

	}

	public int getEmpid() {
		return empid;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEname() {
		return ename;
	}

	public void setD(Department d) {
		this.d = d;
	}

	public Department getD() {
		return d;
	}

	public String toString() {
		return empid + " " + ename + " " + d;
	}
}
