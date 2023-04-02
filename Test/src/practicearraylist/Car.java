package practicearraylist;

public class Car {
	int id,lyear;
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getLyear() {
		return lyear;
	}
	public void setLyear(int lyear) {
		this.lyear = lyear;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return id+" "+name+" "+lyear;
	}
}
