package arraylistpractice;

public class Department {
	int did;
	String dname;

	public void setDid(int did) {
		this.did = did;
	}

	public int getDid() {
		return did;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getDname() {
		return dname;
	}
	public String toString()
	{
		return did+" "+dname;
	}
}
