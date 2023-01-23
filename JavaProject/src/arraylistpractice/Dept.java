package arraylistpractice;

public class Dept {
	String did;
	String dname;
	public void setDid(String did)
	{
		this.did=did;
	}
	public String getDid()
	{
		return did;
	}
	public void setDname(String dname)
	{
		this.dname=dname;
	}
	public String getDname()
	{
		return dname;
	}
	public String toString()
	{
		return did+" "+dname;
	}

}
