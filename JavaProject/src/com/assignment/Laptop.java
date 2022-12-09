package com.assignment;

public class Laptop {
	int noofusbport,processorspeed;
	
	public int getNoofusbport() {
		return noofusbport;
	}

	public void setNoofusbport(int noofusbport) {
		this.noofusbport = noofusbport;
	}

	public int getProcessorspeed() {
		return processorspeed;
	}

	public void setProcessorspeed(int processorspeed) {
		this.processorspeed = processorspeed;
	}

	public static void main(String[] args) {
		Laptop l1=new Laptop();
		l1.setNoofusbport(4);
		l1.setProcessorspeed(3);
		System.out.println(l1.getNoofusbport()+" "+l1.getProcessorspeed());

	}

}
