package monthlytest;

public class Student {
	int studid,yearOfPassing;
	String qualification,name;
	boolean placed;
	public int getStudid() {
		return studid;
	}
	public void setStudid(int studid) {
		this.studid = studid;
	}
	public int getYearOfPassing() {
		return yearOfPassing;
	}
	public void setYearOfPassing(int yearOfPassing) {
		this.yearOfPassing = yearOfPassing;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isPlaced() {
		return placed;
	}
	public void setPlaced(boolean placed) {
		this.placed = placed;
	}
	public String toString()
	{
		return studid+" "+name+" "+qualification+" "+yearOfPassing+" "+placed;
	}
	
}
