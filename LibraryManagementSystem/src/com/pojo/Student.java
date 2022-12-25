package com.pojo;

public class Student {
	private int sid;
	private String sname, semail, sdept;
	private long scontact;

	public int getId() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname()
	{
		return sname;
	}
	public void setSname(String sname)
	{
		this.sname=sname;
	}
	public String getSdept()
	{
		return sdept;
	}
	public void setSdept(String sdept)
	{
		this.sdept=sdept;
	}
	public String getSemail()
	{
		return semail;
	}
	public void setSemail(String semail)
	{
		this.semail=semail;
	}
	public long getSconatct()
	{
		return scontact;
	}
	public void setScontact(long scontact)
	{
		this.scontact=scontact;
	}
	public String toString()
	{
		return sid+" "+sname+" "+sdept+" "+semail+" "+scontact;
	}
}
