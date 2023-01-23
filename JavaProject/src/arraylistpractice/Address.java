package arraylistpractice;

public class Address {
	String addres, city, state;

	public void setAddres(String addres) {
		this.addres = addres;
	}

	public String getAddres() {
		return addres;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCity() {
		return city;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public String toString() {
		return addres + " " + city + " " + state;
	}
}
