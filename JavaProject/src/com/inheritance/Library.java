package com.inheritance;
  // containment example
public class Library {
	private int noofbook;
	private String incharge;

	public int getNoofbook() {
		return noofbook;
	}

	public void setNoofbook(int noofbook) {
		this.noofbook = noofbook;
	}

	public String getIncharge() {
		return incharge;
	}

	public void setIncharge(String incharge) {
		this.incharge = incharge;
	}

	public String toString() {
		return noofbook + " " + incharge;
	}
}
