package comparatorcomparablepractice;

public class Stud implements Comparable<Stud>{
	int sid, smarks;
	String sname, dept;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public int getSmarks() {
		return smarks;
	}

	public void setSmarks(int smarks) {
		this.smarks = smarks;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String toString() {
		return sid + " " + sname + " " + smarks + " " + dept;
	}

	@Override
	public int compareTo(Stud o) {
		// TODO Auto-generated method stub
		if(this.sid>o.sid)
			return 1;
		else if(this.sid<o.sid)
			return -1;
		else
			return 0;
	}

}
