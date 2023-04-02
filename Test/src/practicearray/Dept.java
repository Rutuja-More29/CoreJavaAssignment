package practicearray;

public class Dept {
	int did;
	String dname;
	Dept(int did,String dname){
		this.did=did;
		this.dname=dname;
	}
	public String toString() {
		return did+" "+dname;
	}
}
