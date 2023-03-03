package arraylistpractice;

public class Emp {
	int id, sal;
	String name;

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public int getSal() {
		return sal;
	}

	public String toString() {
		return id + " " + name + " " + sal;
	}
}
