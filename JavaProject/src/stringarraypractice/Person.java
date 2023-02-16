package stringarraypractice;

public class Person {
	int id;
	String pname;
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

	public IdProof[] getIdp() {
		return idp;
	}

	public void setIdp(IdProof[] idp) {
		this.idp = idp;
	}

	public String toString() {
		return id + " " + pname + " " + idp;
	}
}
