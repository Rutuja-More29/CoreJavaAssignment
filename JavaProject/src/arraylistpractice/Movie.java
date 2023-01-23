package arraylistpractice;

import java.util.List;

public class Movie {
	int mid;
	String mname;
	List<String>actor;
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public List<String> getActor() {
		return actor;
	}
	public void setActor(List<String> actor) {
		this.actor = actor;
	}
	public String toString()
	{
		return mid+" "+mname+" "+actor;
	}
}
