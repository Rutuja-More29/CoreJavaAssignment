package comparablecomparator;

public class MovieT {
	int id, noofshows;
	String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNoofshows() {
		return noofshows;
	}

	public void setNoofshows(int noofshows) {
		this.noofshows = noofshows;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return id + " " + name + " " + noofshows;
	}

}
