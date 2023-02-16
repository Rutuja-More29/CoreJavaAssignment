package questionpapre;

public class Country {
	int cid;
	String country;

	Country(int cid, String country) {
		this.cid = cid;
		this.country = country;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String toString() {
		return cid + " " + country;
	}
}
