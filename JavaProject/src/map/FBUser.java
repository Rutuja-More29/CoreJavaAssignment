package map;

public class FBUser {
	int id,password;
	long contact;
	String name,email,gender;
	FBUser(int id,String name,String email,String gender,int password,long contact)
	{
		this.id=id;
		this.name=name;
		this.email=email;
		this.gender=gender;
		this.password=password;
		this.contact=contact;
	}
	public String toString()
	{
		return id+" "+name+" "+email+" "+gender+" "+password+" "+contact;
	}
	public int hashCode()
	{
		return id;
	}
	public boolean equals(Object o)
	{
		FBUser f=(FBUser)o;
		if(this.id==f.id)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
