package arraylistcodes;

public class Dept {
	int did;
	String dname;

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String toString() {
		return did + " " + dname;
	}
}
