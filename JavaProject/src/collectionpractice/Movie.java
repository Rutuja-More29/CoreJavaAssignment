package collectionpractice;

import java.util.ArrayList;

public class Movie {
	int mid;
	String mname;
	ArrayList<String>act;
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
	public ArrayList<String> getAct() {
		return act;
	}
	public void setAct(ArrayList<String> act) {
		this.act = act;
	}
	public String toString()
	{
		return mid+" "+mname+" "+act;
	}
}
