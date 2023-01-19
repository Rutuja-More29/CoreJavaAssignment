package writtencomparatorhashmap;

import java.util.Comparator;

public class Profile {
	String city ,country;
	Profile(String city,String country)
	{
		this.city=city;
		this.country=country;
	}
	public String toString()
	{
		return city+" "+country;
	}
	
	
	
}
